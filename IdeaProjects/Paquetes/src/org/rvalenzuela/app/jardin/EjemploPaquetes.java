package org.rvalenzuela.app.jardin;

import org.rvalenzuela.app.hogar.*;

import static org.rvalenzuela.app.hogar.Persona.*;
import static org.rvalenzuela.app.hogar.ColorPelo.*;
import static org.rvalenzuela.app.hogar.Persona.saludar;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setName("Ricardo");
        p.setApellido("Valenzuela");
        p.setColorPelo(String.valueOf(CAFE));
        System.out.println("p = " + p.getName());

        Perro o = new Perro();
        o.nombre = "Tobby";
        o.raza = "Bulldog";

        String jugando = o.jugar(p);

        System.out.println("jugando = " + jugando);

        String saludo = saludar();

        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

        System.out.println("generoMujer = " + generoMujer + " generoHombre = "+ generoHombre);

    }
}
