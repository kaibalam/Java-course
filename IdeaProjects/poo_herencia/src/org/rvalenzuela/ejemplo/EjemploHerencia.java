package org.rvalenzuela.ejemplo;

import org.rvalenzuela.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("============== creando la instancia de alumno ==============");

        Alumno alumno = new Alumno();
        alumno.setNombre("Ricardo");
        alumno.setApellido("Valenzuela");
        alumno.setInstitucion("INTECAP");
        alumno.setNotaHistoria(6.3);
        alumno.setNotaCastellano(5.5);
        alumno.setNotaMatematica(4.9);

        System.out.println("============== creando la instancia de alumno internacional ==============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Autralia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Intercolegial");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);


        System.out.println("============== creando la instancia de Profesor ==============");
        Profesor profesor = new Profesor();
        profesor.setNombre("Andrés");
        profesor.setApellido("Guzmán");
        profesor.setAsignatura("Matemáticas");

        System.out.println("============== - ==============");
        System.out.println("Alumno:     "+alumno.getNombre()+ " "+alumno.getApellido());
        System.out.println("Alumno internacional: "+ alumnoInt.getNombre() + " "+alumnoInt.getApellido());
        System.out.println("Profesor: "+ profesor.getAsignatura() +" : "+profesor.getNombre()+ " "+ profesor.getApellido());


        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija +" es una clase hija de la clase padre "+ padre);
            clase = clase.getSuperclass();
        }
    }
}
