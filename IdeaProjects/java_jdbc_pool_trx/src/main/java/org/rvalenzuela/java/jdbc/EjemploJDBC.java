package org.rvalenzuela.java.jdbc;

import org.rvalenzuela.java.jdbc.modelo.Categoria;
import org.rvalenzuela.java.jdbc.modelo.Producto;
import org.rvalenzuela.java.jdbc.repositorio.CategoriaRepositorioImpl;
import org.rvalenzuela.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.rvalenzuela.java.jdbc.repositorio.Repositorio;
import org.rvalenzuela.java.jdbc.service.CatalogoServicio;
import org.rvalenzuela.java.jdbc.service.Service;
import org.rvalenzuela.java.jdbc.util.ConexionBasedDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJDBC {
    public static void main(String[] args) throws SQLException {

        Service servicio  = new CatalogoServicio();
        System.out.println("=============== Listar ===============");
        servicio.listar().forEach(System.out::println);

        System.out.println("insertar nueva categoría");
        System.out.println("=============== insertar nueva categoría ===============");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminación");



        System.out.println("=============== insertar nuevo producto ===============");
        Producto producto = new Producto();
        producto.setNombre("Lampara led escritorio");
        producto.setPrecio(990);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdfgh12");
        servicio.guardarProductoConCategoria(producto,categoria);
        System.out.println("producto guadado con exito " + producto.getId());
        servicio.listar().forEach(System.out::println);


    }
}
