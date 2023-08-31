package org.rvalenzuela.optional.ejemplo.repositorio;

import org.rvalenzuela.optional.ejemplo.models.Computadora;

import java.util.Optional;

public interface Repositorio<T>{

    Optional<Computadora> filtrar(String nombre);
}
