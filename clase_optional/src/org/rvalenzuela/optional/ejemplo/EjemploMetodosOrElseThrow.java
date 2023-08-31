package org.rvalenzuela.optional.ejemplo;

import org.rvalenzuela.optional.ejemplo.models.Computadora;
import org.rvalenzuela.optional.ejemplo.repositorio.ConputadorRepositorio;
import org.rvalenzuela.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploMetodosOrElseThrow {
    public static void main(String[] args) {


        Repositorio<Computadora> repositorio = new ConputadorRepositorio();

        Computadora pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "docuementopdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();

        System.out.println(extension);

    }
}

