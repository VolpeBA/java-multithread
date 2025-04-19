package org.example;

// CRIACAO DE MULTIPLAS THREADS
public class Main {

    public static void main(String[] args) {
        // Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        // Criacao de uma nova thread
        Thread t0 = new Thread(new MyRunnable());
        //thread1.run(); executa na thread main ao inves de criar uma nova

        // criando thread com lambda
        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        //thread2.start(); Jamais iniciar a mesma thread mais de uma vez.

        t0.start(); // cria uma nova thread para a execucao
        t1.start();
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName());
        }
    }
}




