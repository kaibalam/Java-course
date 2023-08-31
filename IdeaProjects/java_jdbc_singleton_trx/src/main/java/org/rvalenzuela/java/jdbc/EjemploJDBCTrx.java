package org.rvalenzuela.java.jdbc;

import org.rvalenzuela.java.jdbc.modelo.Categoria;
import org.rvalenzuela.java.jdbc.modelo.Producto;
import org.rvalenzuela.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.rvalenzuela.java.jdbc.repositorio.Repositorio;
import org.rvalenzuela.java.jdbc.util.ConexionBasedDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJDBCTrx {
    public static void main(String[] args) throws SQLException {

        try (Connection conn = ConexionBasedDatos.getInstance()) {
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {


                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("=============== Listar ===============");
                repositorio.Listar().forEach(System.out::println);

                System.out.println("=============== Obtener por ID ===============");
                System.out.println(repositorio.porId(2L));

                System.out.println("=============== insertar nuevo producto ===============");
                Producto producto = new Producto();
                producto.setNombre("Teclado KlipExtreme wireless");
                producto.setPrecio(1233);
                producto.setFechaRegistro(new Date());
                producto.setSku("abc12345");
                Categoria categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);
                System.out.println("=============== Producto guardado con exito ===============");


                System.out.println("=============== editar producto ===============");
                producto = new Producto();
                producto.setId(5L);
                producto.setNombre("Teclado Corsair K95 mecanico");
                producto.setPrecio(1000);
                producto.setSku("abcd12345");
                categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);

                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }


        }

    }
}
