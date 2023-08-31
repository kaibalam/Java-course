    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

    public class EjemploStreamFilterAnyMatch {
        public static void main(String[] args) {
            /*boolean existe = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez")
                    .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                    .peek(System.out::println)
                    .anyMatch(u -> u.getNombre().equals("Ricardo") && u.getApellido().equals("Ramírez"));


            System.out.println("existe = " + existe);*/

            boolean isValid = Stream
                    .of("50258262372","50670024005","50670020100","50670029493","50670020192","50670028572","50670020011")
                    .map(nombre -> new Usuario(nombre,null))
                    .peek(System.out::println)
                    .anyMatch(u -> u.getNombre().equals("50258262372"));
            System.out.println("isValid = " + isValid);




        }
    }
