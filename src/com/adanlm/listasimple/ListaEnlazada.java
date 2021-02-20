package com.adanlm.listasimple;

public class ListaEnlazada extends ListaBase {
    private Nodo ultimo;

    public ListaEnlazada() {
        super();
        this.ultimo = null;
    }

    public void agregarInicio(int numero) {
        Nodo nuevoNodo = new Nodo(numero);
        nuevoNodo.setSiguiente(primero);
        primero = nuevoNodo;
    }

    public void agregarFinal(int numero) {
        Nodo nuevoNodo = new Nodo(numero);
        nuevoNodo.setSiguiente(null);

        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            return;
        }

        ultimo.setSiguiente(nuevoNodo);
        ultimo = nuevoNodo;
    }
}
