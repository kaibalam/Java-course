package org.rvalenzuela.mantenedor.jdbc.repositoiro;

import org.rvalenzuela.mantenedor.jdbc.modelo.Usuarios;
import org.rvalenzuela.mantenedor.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio implements Repositorio<Usuarios>{

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }


    @Override
    public List<Usuarios> Listar() {
        List<Usuarios> usuario = new ArrayList<>();
        try(Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("Select * from usuarios")) {
            while (rs.next()){
                Usuarios u = crearUsuario(rs);
                usuario.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public Usuarios porId(Long id) {
        Usuarios user = null;
        try (PreparedStatement stmt = getConnection().prepareStatement("Select * from usuarios where id = ?")){
            stmt.setLong(1,id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    user = crearUsuario(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void guardar(Usuarios usuarios) {
        String sql;
        if (usuarios.getId() != null && usuarios.getId() >0) {
            sql = "Update usuarios set username=?, password=?, email=? where id= ?";
        } else {
            sql = "Insert into usuarios(username,password,email) values(?,?,?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)){
            stmt.setString(1, usuarios.getUsername());
            stmt.setString(2,usuarios.getPassword());
            stmt.setString(3,usuarios.getEmail());

            if (usuarios.getId() != null && usuarios.getId() >0){
                stmt.setLong(4,usuarios.getId());
            }

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void eliminar(Long id) {
        try (PreparedStatement stmt = getConnection().prepareStatement("Delete from usuarios where id=?")){
            stmt.setLong(1,id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static Usuarios crearUsuario(ResultSet rs) throws SQLException {
        Usuarios u = new Usuarios();
        u.setId(rs.getLong("id"));
        u.setUsername(rs.getString("username"));
        u.setPassword(rs.getString("password"));
        u.setEmail(rs.getString("email"));
        return u;
    }
}
