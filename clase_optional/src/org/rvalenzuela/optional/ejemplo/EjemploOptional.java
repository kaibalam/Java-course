package org.rvalenzuela.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "John";
        Optional<String> opt = Optional.ofNullable(nombre);

        System.out.println("opt = " + opt);
        System.out.println("Esta presente o no = " + opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse( valor -> System.out.println("Hola " + valor), () -> {
                    System.out.println("No esta presente");
                }
        );

        if (opt.isPresent()){
            System.out.println("Hola  " + opt.get());
        } else {
            System.out.println("No esta presente");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmtpy: " + optEmpty);
        System.out.println(optEmpty.isPresent());

    }
}
