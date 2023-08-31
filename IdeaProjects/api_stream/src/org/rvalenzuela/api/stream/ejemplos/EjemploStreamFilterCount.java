    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

    public class EjemploStreamFilterCount {
        public static void main(String[] args) {
            long count = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez")
                    .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                    .filter(n -> n.getNombre().equals("Ricardo"))
                    .peek(System.out::println)
                    .count();


            System.out.println("count = " + count);

        }
    }
