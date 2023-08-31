    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

    public class EjemploStreamFilterEmpty {
        public static void main(String[] args) {
            long count = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","","Ricardo Ramírez","")
                    .filter(String::isEmpty)
                    .peek(System.out::println)
                    .count();

            System.out.println("count = " + count);




        }
    }
