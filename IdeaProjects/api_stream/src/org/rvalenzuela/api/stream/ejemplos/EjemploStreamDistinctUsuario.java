    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

    public class EjemploStreamDistinctUsuario {
        public static void main(String[] args) {
            Stream<Usuario> nombres = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez","Ricardo Valenzuela","Ricardo Valenzuela")
                    .distinct()
                    .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                    ;

            nombres.forEach(System.out::println);




        }
    }
