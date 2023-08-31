package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Ricardo", "Valenzuela"));
        lista.add(new Usuario("Andres", "Hernandez"));
        lista.add(new Usuario("Cesia", "Ramírez"));
        lista.add(new Usuario("Daniela", "Valenzuela"));
        lista.add(new Usuario("Adira", "Valenzuela"));
        lista.add(new Usuario("Juan", "Rosales"));
        lista.add(new Usuario("Josue", "Rivas"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("Valenzuela".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());

    }
}
