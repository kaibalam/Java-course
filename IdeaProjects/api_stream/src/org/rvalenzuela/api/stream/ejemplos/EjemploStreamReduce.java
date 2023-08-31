        package org.rvalenzuela.api.stream.ejemplos;

import java.util.stream.Stream;

    public class EjemploStreamReduce {
        public static void main(String[] args) {
            Stream<String> nombres = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez","Carlos Dardon","Carlos Dardon")
                    .distinct();

                   String resultado =  nombres.reduce("resultado concatenación= ", (a,b) -> a+ ", " + b);
            System.out.println(resultado);





        }
    }
