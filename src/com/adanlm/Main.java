package com.adanlm;

import com.adanlm.cola.Cola;

public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
        System.out.println(cola.peek());
        //Para probar
    }
}
