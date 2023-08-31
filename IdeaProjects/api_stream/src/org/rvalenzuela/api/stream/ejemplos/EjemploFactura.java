package org.rvalenzuela.api.stream.ejemplos;

import org.rvalenzuela.api.stream.ejemplos.models.Factura;
import org.rvalenzuela.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploFactura {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("John", "Doe");
        Usuario usuario2 = new Usuario("Pepe", "Peréz");

        usuario1.addFactura(new Factura("compras tecnología"));
        usuario1.addFactura(new Factura("muebres"));
        usuario2.addFactura(new Factura("biicleta"));
        usuario2.addFactura(new Factura("Notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(usuario1,usuario2);

        /*for (Usuario u : usuarios){
            for (Factura f : u.getFacturas()){
                System.out.println(f.getDescription());
            }
        }*/
        usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream)
                .forEach(factura -> System.out.println(factura.getDescription().concat(" cliente: ")
                        .concat(factura.getUsuario().toString())));
    }
}
