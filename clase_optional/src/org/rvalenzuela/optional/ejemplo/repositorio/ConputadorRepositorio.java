package org.rvalenzuela.optional.ejemplo.repositorio;

import org.rvalenzuela.optional.ejemplo.models.Computadora;
import org.rvalenzuela.optional.ejemplo.models.Fabricante;
import org.rvalenzuela.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ConputadorRepositorio implements Repositorio<Computadora> {

    private List<Computadora> dataSource;
    public ConputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computadora asus = new Computadora("Asus ROG", "Strix G512");
        asus.setProcesador(proc );
        dataSource.add(asus);
        dataSource.add(new Computadora("Macbook Pro","MVVK2CI"));
    }

    @Override
    public Optional<Computadora> filtrar(String nombre) {
        /*for (Computadora c: dataSource){
            if(c.getNombre().equals(nombre)){
                return Optional.of(c);
            }
        }*/
        return dataSource.stream().filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
    }
}
