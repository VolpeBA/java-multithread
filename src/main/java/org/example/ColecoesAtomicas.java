package org.example;

import java.util.concurrent.atomic.AtomicInteger;

// JAVA MULTITHREAD - Colecoes Atomicas
public class ColecoesAtomicas {

    static AtomicInteger i = new AtomicInteger(-1);

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
    }

    public static class MyRunnable implements Runnable {

        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " : " + i.incrementAndGet());
        }
    }
}
