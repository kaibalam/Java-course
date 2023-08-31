    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class EjemploStreamFlatMap {
        public static void main(String[] args) {
            Stream<Usuario> nombres = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez","Cesia Valenzuela","Daniela Valenzuela")
                    .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                    .flatMap(u -> {
                        if (u.getApellido().equals("Valenzuela")){
                            return Stream.of(u);
                        }
                        return Stream.empty();
                    })
                    .peek(System.out::println);

            //nombres.forEach(System.out::println);

            nombres.forEach(System.out::println);




        }
    }
