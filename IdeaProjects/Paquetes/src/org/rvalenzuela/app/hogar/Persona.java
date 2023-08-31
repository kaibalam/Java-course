package org.rvalenzuela.app.hogar;

public class Persona {

    private String name;
    private String apellido;

    private String colorPelo;
    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarPelota(){
        return "lanza la pelota al perro";
    }

    public static String saludar(){
        return "Hola que tal";
    }
}
