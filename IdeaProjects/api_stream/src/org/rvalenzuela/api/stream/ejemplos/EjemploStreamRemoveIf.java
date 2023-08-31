package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Respuestas;

import java.util.ArrayList;
import java.util.List;

public class EjemploStreamRemoveIf {
    public static void main(String[] args) {


        List<Respuestas> test = new ArrayList<>();
        test.add(new Respuestas(1L,"Prueba1",false,2345L));
        test.add(new Respuestas(2L,"Prueba2",true,null));

        test.removeIf(Respuestas::isMark);

        test.forEach(System.out::println);





    }
}
