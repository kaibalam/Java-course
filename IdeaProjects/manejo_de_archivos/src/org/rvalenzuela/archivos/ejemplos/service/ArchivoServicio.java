package org.rvalenzuela.archivos.ejemplos.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo,true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.append("imei").append(";").append("motivo");
            buffer.close();
            System.out.println("se escribió el archivo!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean borrarArchivo(String nombre){
        File archivo = new File(nombre);
        boolean borrado = false;
        try {
            borrado = archivo.delete();
            System.out.println("Se eliminó el archivo");
        } catch (Exception e){
            e.printStackTrace();
        }
        return borrado;
    }
}
