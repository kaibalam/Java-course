package org.rvalenzuela.api.stream.ejemplos.models;

public class Factura {
    private String description;
    private Usuario usuario;

    public Factura(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
