package org.rvalenzuela.ejemplo;

import org.rvalenzuela.pooherencia.Alumno;
import org.rvalenzuela.pooherencia.AlumnoInternacional;
import org.rvalenzuela.pooherencia.Persona;
import org.rvalenzuela.pooherencia.Profesor;

public class EjemploHerenciaSobrecargaToString {
    public static void main(String[] args) {

        System.out.println("============== creando la instancia de alumno ==============");

        Alumno alumno = new Alumno("Ricardo","Valenzuela", 14,"Instituto Adolfo V. Hall");
        alumno.setNotaHistoria(6.3);
        alumno.setNotaCastellano(5.5);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("alumnos@mail.com");

        System.out.println("============== creando la instancia de alumno internacional ==============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Intercolegial");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("alumnoInte@mail.com");

        Profesor profesor = new Profesor("Andrés","Guzmán","Lógica de programación");
        profesor.setEdad(42);


        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
        System.out.println();



    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
