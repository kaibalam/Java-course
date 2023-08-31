package org.rvalenzuela.models;

public class Gerente extends Empleado{
    private double presupuesto;

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+"\npresupuesto= " + presupuesto;
    }
}
