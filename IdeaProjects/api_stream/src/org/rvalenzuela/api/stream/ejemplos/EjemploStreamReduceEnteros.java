        package org.rvalenzuela.api.stream.ejemplos;

import java.util.stream.Stream;

        public class EjemploStreamReduceEnteros {
            public static void main(String[] args) {
                Stream<Integer> nombres = Stream
                        .of(5,5,6,7,8,9,12);

                       int resultado =  nombres.reduce(0, Integer::sum);
                System.out.println(resultado);





            }
        }
