package org.rvalenzuela.java.jdbc.service;

import org.rvalenzuela.java.jdbc.modelo.Categoria;
import org.rvalenzuela.java.jdbc.modelo.Producto;
import org.rvalenzuela.java.jdbc.repositorio.CategoriaRepositorioImpl;
import org.rvalenzuela.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.rvalenzuela.java.jdbc.repositorio.Repositorio;
import org.rvalenzuela.java.jdbc.util.ConexionBasedDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CatalogoServicio implements Service{
    private Repositorio<Producto> productoRepositorio;
    private Repositorio<Categoria> categoriaRepositorio;


    public CatalogoServicio() {
        this.productoRepositorio = new ProductoRepositorioImpl();
        this.categoriaRepositorio = new CategoriaRepositorioImpl();
    }

    @Override
    public List<Producto> listar() throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            productoRepositorio.setConn(conn);
            return productoRepositorio.Listar();
        }
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            productoRepositorio.setConn(conn);
            return productoRepositorio.porId(id);
        }
    }

    @Override
    public Producto guardar(Producto producto) throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            productoRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            Producto nuevoProducto = null;
            try {
                nuevoProducto = productoRepositorio.guardar(producto);
                conn.commit();

            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
            return nuevoProducto;
        }

    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            productoRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {

                productoRepositorio.eliminar(id);
                conn.commit();

            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Categoria> listarCategoria() throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            categoriaRepositorio.setConn(conn);
            return categoriaRepositorio.Listar();
        }
    }

    @Override
    public Categoria porIdCategoria(Long id) throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            categoriaRepositorio.setConn(conn);
            return categoriaRepositorio.porId(id);
        }
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            Categoria nuevaCategoria = null;
            try {
                nuevaCategoria = categoriaRepositorio.guardar(categoria);
                conn.commit();

            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
            return nuevaCategoria;
        }

    }

    @Override
    public void eliminarCategoria(Long id) throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {

                categoriaRepositorio.eliminar(id);
                conn.commit();

            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }

    }

    @Override
    public void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException {
        try (Connection conn = ConexionBasedDatos.getConecction()){
            productoRepositorio.setConn(conn);
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }

            try {
                Categoria nuevaCategoria = categoriaRepositorio.guardar(categoria);
                producto.setCategoria(nuevaCategoria);
                productoRepositorio.guardar(producto);
                conn.commit();

            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }

        }

    }
}
