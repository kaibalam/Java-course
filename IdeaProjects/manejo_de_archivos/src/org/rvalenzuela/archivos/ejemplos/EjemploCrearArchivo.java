package org.rvalenzuela.archivos.ejemplos;

import org.rvalenzuela.archivos.ejemplos.service.ArchivoServicio;

import java.io.File;
import java.util.Arrays;
import java.util.logging.Logger;

public class EjemploCrearArchivo {

    public static void main(String[] args) {
        String nombreRuta = "C:\\Curso\\Java\\archivo\\";
        String nombreArchivo = "java.txt";
        File directorio = new File(nombreRuta);
        if (!directorio.exists()){
            directorio.mkdir();
            System.out.println(directorio);
        }
        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo(nombreRuta.concat(nombreArchivo));
        service.crearArchivo(nombreRuta.concat(nombreArchivo.replace(".txt","2.txt")));
        boolean existe = Arrays.stream(directorio.list()).anyMatch(fl -> fl.contains(nombreArchivo));
        if(existe){
            service.borrarArchivo(nombreRuta.concat(nombreArchivo));
        } else {
            System.out.println("Archivo no existe!");
        }


    }


}
