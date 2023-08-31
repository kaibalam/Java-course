package org.rvalenzuela.optional.ejemplo;

import org.rvalenzuela.optional.ejemplo.models.Computadora;
import org.rvalenzuela.optional.ejemplo.repositorio.ConputadorRepositorio;
import org.rvalenzuela.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {


        Repositorio<Computadora> repositorio = new ConputadorRepositorio();



        repositorio.filtrar("Asus rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));


        //Optional<Computadora> pc = repositorio.filtrar("Asus");



        /*if(pc.isPresent()){
            System.out.println(pc.get().getNombre());
        } else {
            System.out.println("No se encontro");
        }*/

    }
}
