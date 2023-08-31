package org.rvalenzuela.optional.ejemplo;

import org.rvalenzuela.optional.ejemplo.models.Computadora;
import org.rvalenzuela.optional.ejemplo.models.Fabricante;
import org.rvalenzuela.optional.ejemplo.models.Procesador;
import org.rvalenzuela.optional.ejemplo.repositorio.ConputadorRepositorio;
import org.rvalenzuela.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter   {
    public static void main(String[] args) {

        Repositorio<Computadora> repositorio = new ConputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computadora::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println(f);
    }
}
