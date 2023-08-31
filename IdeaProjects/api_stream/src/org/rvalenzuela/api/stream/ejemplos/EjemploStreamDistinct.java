    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

    public class EjemploStreamDistinct {
        public static void main(String[] args) {
            Stream.of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez","Carlos Dardon","Carlos Dardon")
                    .distinct()
                    .forEach(System.out::println);





        }
    }
