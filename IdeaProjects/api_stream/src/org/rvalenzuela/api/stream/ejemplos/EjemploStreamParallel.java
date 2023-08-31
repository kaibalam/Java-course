package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
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

        long tiempo1 = System.currentTimeMillis();

        String nombres = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre thread: "+ Thread.currentThread().getName() +
                            " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("Willis".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                        .findAny()
                .orElse("no se encontró");
        long tiempo2 = System.currentTimeMillis();

        System.out.println("tiempo total: " + (tiempo2 - tiempo1));
        System.out.println(nombres);

    }
}
