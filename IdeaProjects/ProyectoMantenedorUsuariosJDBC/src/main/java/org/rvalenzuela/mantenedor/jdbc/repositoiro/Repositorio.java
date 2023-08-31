package org.rvalenzuela.mantenedor.jdbc.repositoiro;

import java.util.List;

public interface Repositorio<T> {
    List<T> Listar();

    T porId(Long id);

    void guardar(T t);

    void eliminar(Long id);
}
