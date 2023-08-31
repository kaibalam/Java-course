package org.rvalenzuela.java.jdbc;

import org.rvalenzuela.java.jdbc.modelo.Categoria;
import org.rvalenzuela.java.jdbc.modelo.Producto;
import org.rvalenzuela.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.rvalenzuela.java.jdbc.repositorio.Repositorio;
import org.rvalenzuela.java.jdbc.util.ConexionBasedDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJDBC {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== Listar ===============");
            repositorio.Listar().forEach(System.out::println);

            System.out.println("=============== Obtener por ID ===============");
            System.out.println(repositorio.porId(2L));

            System.out.println("=============== insertar nuevo producto ===============");
            Producto producto = new Producto();
            producto.setNombre("Nootebooko Acer ROG");
            producto.setPrecio(2550);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("=============== Producto guardado con exito ===============");
            repositorio.Listar().forEach(System.out::println);

    }
}
