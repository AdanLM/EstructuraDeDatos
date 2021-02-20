package com.adanlm.listasimple;

public class ListaBase {

    protected Nodo primero;

    public ListaBase() {
        this.primero = null;
    }

    public void buscar(int numero) {
        Nodo nodoEncontrado = buscarNodo(numero);

        if (nodoEncontrado == null)
            System.out.println("Nodo no encontrado");
        else
            System.out.println("Nodo encontrado: " + nodoEncontrado.getNumero());
    }

    private Nodo buscarNodo(int numero) {
        Nodo nodoActual = primero;
        while (nodoActual != null) {
            if (nodoActual.getNumero() == numero)
                return nodoActual;
            nodoActual = nodoActual.siguiente();
        }
        return null;
    }

    public boolean eliminar(int numero) {
        Nodo nodoActual = primero;
        Nodo nodoAnterior = null;

        if(primero.getNumero() == numero){
            primero = primero.siguiente();
            return true;
        }

        while(nodoActual != null){
            if(nodoActual.getNumero() == numero){
                nodoAnterior.setSiguiente(nodoActual.siguiente());
                nodoActual.setSiguiente(null);
                return true;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente();
        }
        return false;
    }

    public void verLista() {
        Nodo nodoActual = primero;
        while (nodoActual != null) {
            System.out.println(nodoActual.getNumero());
            nodoActual = nodoActual.siguiente();
        }
    }
}
