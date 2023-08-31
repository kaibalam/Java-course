    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class EjemploStreamFilterSingle {
        public static void main(String[] args) {
            Stream<Usuario> nombres = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez")
                    .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                    .filter(u -> u.getNombre().equals("Ricardox"))
                    .peek(System.out::println);

            //nombres.forEach(System.out::println);

            Optional<Usuario> usuario = nombres.findFirst();
            //System.out.println("usuario = " + usuario.orElse(new Usuario("NO existe", "Doe")).getNombre());

            //System.out.println("usuario = " + usuario.orElseGet(() -> new Usuario("No hay","otro")).getNombre());
            if(usuario.isPresent()){
                System.out.println("usuario.get() = " + usuario.get());
            } else {
                System.out.println("No se encontró el objeto");
            }



        }
    }
