package org.rvalenzuela.ejemplo;

import org.rvalenzuela.pooherencia.Alumno;
import org.rvalenzuela.pooherencia.AlumnoInternacional;
import org.rvalenzuela.pooherencia.Persona;
import org.rvalenzuela.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en común del tipo Persona:");
        System.out.println("Alumno: "+persona.getNombre()+"\nApellido: "+persona.getApellido()+", \nedad: "+persona.getEdad()+", \nemail: "+ persona.getEmail());
        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo de alumno: ");
            System.out.println("institución: "+ ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemáticas: "+ ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: "+ ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: "+ ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo ´los datos de tipo alumno internacional: ");
                System.out.println("Nota idioma: "+ ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("pais: "+ ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("========================== Sobre escritura promedio ============================");
            System.out.println("El promedio es: "+((Alumno) persona).calcularPromedio());
        }
        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor:");
            System.out.println("Asignatura: "+ ((Profesor) persona).getAsignatura());
        }
        System.out.println("========================== Sobre escritura Saludar ============================");
        System.out.println(persona.saludar());

        System.out.println("======================================================");

    }
}
