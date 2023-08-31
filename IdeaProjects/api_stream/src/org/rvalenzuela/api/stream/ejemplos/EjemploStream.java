package org.rvalenzuela.api.stream.ejemplos;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
//        Stream<String> nombres = Stream.of("Ricardo","Carlos","Marvin","Salmon");
//
//        nombres.forEach(System.out::println);
//
//        String[] arr = {"Ricardo","Carlos","Marvin","Salmon"};
//
//        nombres = Arrays.stream(arr);
//
//        nombres.forEach(System.out::println);

        Stream<String> nombres = Stream.<String>builder().add("Ricardo").add("Cesia").add("Daniela").build();
        nombres.forEach(System.out::println);
    }
}
