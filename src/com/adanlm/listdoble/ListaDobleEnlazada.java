package com.adanlm.listdoble;

public class ListaDobleEnlazada {

    private Nodo primero, ultimo = null;
    private int tamaño = 0;

    public ListaDobleEnlazada() {

    }

    public void agregarInicio(int numero){
        Nodo nuevoNodo = new Nodo(numero);

        if(tamaño == 0){
            primero = ultimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(primero);
            primero.setAnterior(nuevoNodo);
            primero = nuevoNodo;
        }
        tamaño++;
    }

    public void agregarFinal(int numero){
        Nodo nuevoNodo = new Nodo(numero);
        if(tamaño == 0){
            primero = ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
        }
    }

    public void agregarEnPosicion(int pos, int numero){
        Nodo nuevoNodo = new Nodo(numero);
        Nodo actualNodo = primero;
        int i = 0;

        while( i < (pos - 1) && actualNodo != null){
            i++;
            actualNodo = actualNodo.siguiente();
        }

        if(actualNodo == null){
            nuevoNodo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        } else if (actualNodo == primero){
            nuevoNodo.setSiguiente(actualNodo);
            actualNodo.setAnterior(nuevoNodo);
            primero = nuevoNodo;
        } else {
            Nodo anteriorT = actualNodo.anterior();
            nuevoNodo.setSiguiente(actualNodo);
            nuevoNodo.setAnterior(anteriorT);

            actualNodo.setAnterior(nuevoNodo);
            anteriorT.setSiguiente(nuevoNodo);
        }
    }

    public void eliminarNodo(){
        Nodo temp = primero.siguiente();
        primero.setSiguiente(null);
        temp.setAnterior(null);
        primero = temp;
    }

    public int buscarNodo(int numero){
        Nodo actualNodo = primero;
        while(actualNodo != null){
            if(actualNodo.getNumero() == numero){
                return numero;
            }
            actualNodo = actualNodo.siguiente();
        }
        return -1;
    }

    public void mostrarLista(){
        Nodo nodoActual = primero;
        while (nodoActual != null) {
            System.out.println(nodoActual.getNumero());
            nodoActual = nodoActual.siguiente();
        }
    }
}
