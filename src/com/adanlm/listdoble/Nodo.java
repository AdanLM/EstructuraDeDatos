package com.adanlm.listdoble;

public class Nodo {
    private int numero;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(int numero) {
        this.numero = numero;
        this.siguiente = this.anterior = null;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getNumero() {
        return numero;
    }

    public Nodo siguiente() {
        return this.siguiente;
    }

    public Nodo anterior() {
        return this.anterior;
    }
}
