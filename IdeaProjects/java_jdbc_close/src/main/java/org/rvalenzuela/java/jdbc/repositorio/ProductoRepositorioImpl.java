package org.rvalenzuela.java.jdbc.repositorio;

import org.rvalenzuela.java.jdbc.modelo.Categoria;
import org.rvalenzuela.java.jdbc.modelo.Producto;
import org.rvalenzuela.java.jdbc.util.ConexionBasedDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto> {

    private Connection getConnection() throws SQLException {
        return ConexionBasedDatos.getInstance();
    }

    @Override
    public List<Producto> Listar() {
        List<Producto> productos = new ArrayList<>();
        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("Select p.*,c.nombre as categoria from productos as p " +
                     "inner join categorias as c on (p.categorias_id = c.id)")){
            while (rs.next()){
                Producto p = crearProducto(rs);

                productos.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    @Override
    public Producto porId(long id) {
        Producto producto = null;

        try (Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement("select p.*,c.nombre as categoria from productos as p " +
                                "inner join categorias as c on (p.categorias_id = c.id) where p.id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    producto = crearProducto(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) {
        String sql;
        if (producto.getId() != null && producto.getId() > 0) {
            sql = "UPDATE productos SET nombre=?, precio=?, categorias_id=? where id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, categorias_id, fecha_registro) VALUES(?,?,?,?)";
        }
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,producto.getNombre());
            stmt.setLong(2,producto.getPrecio());
            stmt.setLong(3,producto.getCategoria().getId());

            if (producto.getId() != null && producto.getId() > 0) {
                stmt.setLong(4, producto.getId());
            } else {
                stmt.setDate(4,new Date(producto.getFechaRegistro().getTime()));
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(Long id) {
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement("Delete from productos where id = ?")){
            stmt.setLong(1,id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static Producto crearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setFechaRegistro(rs.getDate("fecha_registro"));
        Categoria categoria = new Categoria();
        categoria.setId(rs.getLong("categorias_id"));
        categoria.setNombre(rs.getString("categoria"));
        p.setCategoria(categoria);
        return p;
    }
}
