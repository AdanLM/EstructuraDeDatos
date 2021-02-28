package com.adanlm.cola;

import com.adanlm.listasimple.Nodo;

public class Cola {
    private Nodo primero;
    private Nodo ultimo;

    public Cola() {
        this.primero = this.ultimo = null;
    }

    public void add(int numero){
        Nodo nuevoNodo = new Nodo(numero);

        if(primero == null){
            primero = ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public void remove(){
        primero = primero.siguiente();
    }

    public Object poll(){
        if(primero != null){
            Nodo tmp = primero;
            remove();
            return tmp.getNumero();
        }
        return null;
    }

    public Object peek(){
        return (primero == null) ? null : primero.getNumero();
    }

    public boolean isEmpty(){
        return (primero == null) ? true : false;
    }
}
