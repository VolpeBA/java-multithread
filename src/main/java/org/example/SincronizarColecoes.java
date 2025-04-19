package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// JAVA MULTITHREAD - Sincronizar colecoes
public class SincronizarColecoes {

    static List<String> lista = Collections.synchronizedList(new ArrayList<String>());

    public static void main(String[] args) throws InterruptedException {

//        exemplos de sincronizacoes, utilizar de acordo com o tipo da lista
//        lista = Collections.synchronizedList(lista);
//        lista = Collections.synchronizedMap(lista);
//        lista = Collections.synchronizedSet(lista);
//        lista = Collections.synchronizedCollection(lista);

        MyRunnable myRunnable = new MyRunnable();

        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(200);
        System.out.println("Lista: " + lista);
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            lista.add("A");
            String name = Thread.currentThread().getName();
            System.out.println("Inseriu na lista: " + name);

        }
    }
}
