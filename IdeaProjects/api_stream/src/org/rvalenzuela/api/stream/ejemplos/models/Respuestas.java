package org.rvalenzuela.api.stream.ejemplos.models;

public class Respuestas {
    private Long id;
    private String nombre;
    private boolean mark;
    private Long data;

    public Respuestas() {
    }

    public Respuestas(Long id, String nombre, boolean mark, Long data) {
        this.id = id;
        this.nombre = nombre;
        this.mark = mark;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Respuestas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mark=" + mark +
                ", data=" + data +
                '}';
    }
}
