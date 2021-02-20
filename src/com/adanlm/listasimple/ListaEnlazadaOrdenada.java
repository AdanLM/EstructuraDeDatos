package com.adanlm.listasimple;

public class ListaEnlazadaOrdenada extends ListaBase {

    public ListaEnlazadaOrdenada() {
        super();
    }

    public void agregar(int numero) {
        Nodo nuevoNodo = new Nodo(numero);
        if(primero == null){
            primero = nuevoNodo;
        } else if(numero < primero.getNumero() || numero == primero.getNumero()){
            nuevoNodo.setSiguiente(primero);
            primero = nuevoNodo;
        } else {
            Nodo nodoActual = primero;
            Nodo nodoAnterior = primero;
            while((nodoActual != null) && numero > nodoActual.getNumero()){
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.siguiente();
            }

            nodoAnterior.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(nodoActual);

        }
    }

}
