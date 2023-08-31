package org.rvalenzuela.java.jdbc;

import org.rvalenzuela.java.jdbc.modelo.Categoria;
import org.rvalenzuela.java.jdbc.modelo.Producto;
import org.rvalenzuela.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.rvalenzuela.java.jdbc.repositorio.Repositorio;
import org.rvalenzuela.java.jdbc.util.ConexionBasedDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJDBCUpdate {
    public static void main(String[] args) {

        try (Connection conn = ConexionBasedDatos.getInstance()) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== Listar ===============");
            repositorio.Listar().forEach(System.out::println);

            System.out.println("=============== Obtener por ID ===============");
            System.out.println(repositorio.porId(2L));

            System.out.println("=============== editar producto ===============");
            Producto producto = new Producto();
            producto.setId(5L);
            producto.setNombre("Teclado Corsair K95 mecanico");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("=============== Producto actualizado con exito ===============");
            repositorio.Listar().forEach(System.out::println);

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }

    }
}
