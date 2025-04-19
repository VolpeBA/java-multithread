package org.example;

import java.util.*;
import java.util.concurrent.*;

// JAVA MULTITHREAD - Colecoes utilizadas quando tem concorrencia
public class ColecoesParaConcorrencia {

    static List<String> lista = Collections.synchronizedList(new ArrayList<String>());
    private static final Map<Integer, String> mapa = new ConcurrentHashMap<>();
    private static final BlockingQueue<String> fila = new LinkedBlockingQueue<>(2);
    private static final BlockingQueue<String> filaDeque = new LinkedBlockingDeque<>();

    public static void main(String[] args) throws InterruptedException {

        MyRunnable myRunnable = new MyRunnable();

        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(200);
//        System.out.println("Lista: " + lista);
//        System.out.println("Mapa: " + mapa);
        System.out.println("Fila: " + fila);
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
//            lista.add("A");
//            mapa.put(new Random().nextInt(3), "Elemento " + new Random().nextInt(100));
            fila.add("Add");
            String name = Thread.currentThread().getName();
            System.out.println("Inseriu: " + name);
        }
    }
}
