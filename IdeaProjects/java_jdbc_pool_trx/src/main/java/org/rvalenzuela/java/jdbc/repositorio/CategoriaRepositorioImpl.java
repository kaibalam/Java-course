package org.rvalenzuela.java.jdbc.repositorio;

import org.rvalenzuela.java.jdbc.modelo.Categoria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepositorioImpl implements Repositorio<Categoria> {
    private Connection conn;

    public CategoriaRepositorioImpl(Connection conn) {
        this.conn = conn;
    }

    public CategoriaRepositorioImpl() {
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Categoria> Listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("Select * from categorias")){
         while (rs.next()){
             categorias.add(createCategoria(rs));
         }
        }
        return categorias;
    }

    @Override
    public Categoria porId(long id) throws SQLException {
        Categoria categoria = null;
        try (PreparedStatement stmt = conn.prepareStatement("Select * from categorias c where c.id = ?")){
            stmt.setLong(1,id);
            try (ResultSet rs = stmt.executeQuery()){
                if (rs.next()){
                    categoria = createCategoria(rs);
                }
            }

        }
        return categoria;
    }

    @Override
    public Categoria guardar(Categoria categoria) throws SQLException {
        String sql = null;
        if (categoria.getId() != null && categoria.getId() > 0){
            sql = "update categorias set nombre=? where id=?";
        } else {
            sql = "insert into categorias(nombre) values(?)";
        }
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            stmt.setString(1,categoria.getNombre());
            if (categoria.getId() != null && categoria.getId() >0){
                stmt.setLong(2,categoria.getId());
            }
            stmt.executeUpdate();

            if (categoria.getId() == null){
                try (ResultSet rs = stmt.getGeneratedKeys()){
                    if(rs.next()){
                        categoria.setId(rs.getLong(1));
                    }

                }
            }

        }
        return categoria;
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("delete from categorias where id=?")){
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }

    }

    private static Categoria createCategoria(ResultSet rs) throws SQLException {
        Categoria c = new Categoria();
        c.setId(rs.getLong("id"));
        c.setNombre(rs.getString("nombre"));
        return c;
    }
}
