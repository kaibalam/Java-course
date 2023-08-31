package org.rvalenzuela.app.jardin;

import org.rvalenzuela.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    int x = 0;

    String s = "3";

    String jugar(Persona persona){
        x = Integer.parseInt(s);
        return persona.lanzarPelota();

    }


}
