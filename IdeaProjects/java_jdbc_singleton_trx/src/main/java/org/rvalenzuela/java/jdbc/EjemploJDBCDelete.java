package org.rvalenzuela.java.jdbc;

import org.rvalenzuela.java.jdbc.modelo.Producto;
import org.rvalenzuela.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.rvalenzuela.java.jdbc.repositorio.Repositorio;
import org.rvalenzuela.java.jdbc.util.ConexionBasedDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJDBCDelete {
    public static void main(String[] args) {

        try (Connection conn = ConexionBasedDatos.getInstance()) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== Listar ===============");
            repositorio.Listar().forEach(System.out::println);

            System.out.println("=============== Obtener por ID ===============");
            System.out.println(repositorio.porId(2L));

            System.out.println("=============== eliminar producto ===============");
            repositorio.eliminar(3L);
            System.out.println("=============== Producto eliminado con exito ===============");
            repositorio.Listar().forEach(System.out::println);

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }

    }
}
