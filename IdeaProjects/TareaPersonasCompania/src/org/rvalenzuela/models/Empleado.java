package org.rvalenzuela.models;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;
    private static int ultimoIdEmp;

    public Empleado() {
        this.empleadoId = ++ultimoIdEmp;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        double aumento = 0.0;
        if (porcentaje < 0){
            aumento = remuneracion +(this.remuneracion * (porcentaje/100));
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "\nremuneración= " + remuneracion +
                ",\nempleadoId= " + empleadoId;
    }
}
