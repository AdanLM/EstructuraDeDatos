package com.adanlm.listasimple;

public class Nodo {

    private int numero;
    private Nodo siguiente;

    public Nodo(int numero) {
        this.numero = numero;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getNumero() {
        return numero;
    }

    public Nodo siguiente() {
        return siguiente;
    }
}
