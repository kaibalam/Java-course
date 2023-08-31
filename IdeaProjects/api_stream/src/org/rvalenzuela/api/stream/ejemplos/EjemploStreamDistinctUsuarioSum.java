    package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

    public class EjemploStreamDistinctUsuarioSum {
        public static void main(String[] args) {
            IntStream largoNombres = Stream
                    .of("Ricardo Valenzuela","Carlos Dardon","Marvin Moran","Salmon Ortega","Ricardo Ramírez","Ricardo Valenzuela","Ricardo Valenzuela")
                    .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                    .distinct()
                    .mapToInt(u -> u.toString().length())
                    .peek(System.out::println);


            IntSummaryStatistics stats = largoNombres.summaryStatistics();
            System.out.println("total:" +largoNombres.sum());
            System.out.println("Sum: "+stats.getSum());
            System.out.println("max: "+stats.getMax());
            System.out.println("min: "+stats.getMin());
            System.out.println("avg: "+stats.getAverage());



        }
    }
