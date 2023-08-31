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
    public List<Producto>   Listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("Select p.*,c.nombre as categoria from productos as p " +
                     "inner join categorias as c on (p.categorias_id = c.id)")){
            while (rs.next()){
                Producto p = crearProducto(rs);

                productos.add(p);
            }

        }
        return productos;
    }

    @Override
    public Producto porId(long id) throws SQLException {
        Producto producto = null;

        try (PreparedStatement ps = getConnection().prepareStatement("select p.*,c.nombre as categoria from productos as p " +
                                "inner join categorias as c on (p.categorias_id = c.id) where p.id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    producto = crearProducto(rs);
                }
            }
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) throws SQLException {
        String sql;
        if (producto.getId() != null && producto.getId() > 0) {
            sql = "UPDATE productos SET nombre=?, precio=?, categorias_id=?, sku=? where id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, categorias_id, sku, fecha_registro) VALUES(?,?,?,?,?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)){
            stmt.setString(1,producto.getNombre());
            stmt.setLong(2,producto.getPrecio());
            stmt.setLong(3,producto.getCategoria().getId());
            stmt.setString(4,producto.getSku());

            if (producto.getId() != null && producto.getId() > 0) {
                stmt.setLong(5, producto.getId());
            } else {
                stmt.setDate(5,new Date(producto.getFechaRegistro().getTime()));
            }

            stmt.executeUpdate();
        }
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try (PreparedStatement stmt = getConnection().prepareStatement("Delete from productos where id = ?")){
            stmt.setLong(1,id);
            stmt.executeUpdate();

        }

    }

    private static Producto crearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setFechaRegistro(rs.getDate("fecha_registro"));
        p.setSku(rs.getString("sku"));
        Categoria categoria = new Categoria();
        categoria.setId(rs.getLong("categorias_id"));
        categoria.setNombre(rs.getString("categoria"));
        p.setCategoria(categoria);
        return p;
    }
}
