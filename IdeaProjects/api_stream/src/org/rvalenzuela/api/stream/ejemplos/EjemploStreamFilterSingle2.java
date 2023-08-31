    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

    public class EjemploStreamFilterSingle2 {
        public static void main(String[] args) {
            Usuario usuario = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez")
                    .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                    .peek(System.out::println)
                    .filter(u -> u.getId().equals(1))
                    .findFirst().get();


            System.out.println("usuario = " + usuario);




        }
    }
