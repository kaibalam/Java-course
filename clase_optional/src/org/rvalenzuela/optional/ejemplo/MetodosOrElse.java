package org.rvalenzuela.optional.ejemplo;

import org.rvalenzuela.optional.ejemplo.models.Computadora;
import org.rvalenzuela.optional.ejemplo.repositorio.ConputadorRepositorio;
import org.rvalenzuela.optional.ejemplo.repositorio.Repositorio;

public class MetodosOrElse {
    public static void main(String[] args) {


        Repositorio<Computadora> repositorio = new ConputadorRepositorio();

        Computadora defecto = new Computadora("HP Omen","LA00=1");
        Computadora pc = repositorio.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("macbook").orElseGet(MetodosOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computadora valorDefecto(){
        System.out.println("Obteniendo el valor por defecto");
        return new Computadora("HP Omen", "LA0001");
    }
}

