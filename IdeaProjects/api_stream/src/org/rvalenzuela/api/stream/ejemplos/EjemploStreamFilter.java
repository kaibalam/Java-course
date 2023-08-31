    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class EjemploStreamFilter {
        public static void main(String[] args) {
            Stream<Usuario> nombres = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez")
                    .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                    .filter(u -> u.getNombre().equals("Ricardo"))
                    //.peek(System.out::println)
                    ;

            //nombres.forEach(System.out::println);

            List<Usuario> lista = nombres.collect(Collectors.toList());
            lista.forEach(System.out::println);




        }
    }
