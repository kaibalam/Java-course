package org.rvalenzuela.java.jdbc.repositorio;

import java.util.List;

public interface Repositorio<T> {
    List<T> Listar();
    T porId(long id);

    void guardar(T t);

    void eliminar(Long id);


}
