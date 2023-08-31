package org.rvalenzuela.models;

public class Cliente extends Persona{
    private int clienteId;
    private static int lastIdClient;

    public Cliente() {
        this.clienteId = ++lastIdClient;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nclienteId= " + clienteId ;
    }
}
