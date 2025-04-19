package org.example;

public class VolatileAndYield {

    private static volatile int numero = 0;
    private static volatile boolean preparado = false;

//    private static int numero = 0;
//    private static boolean preparado = false;

    public static void main(String[] args) {
        while (true) {

            Thread t0 = new Thread(new MyRunnable());
            Thread t1 = new Thread(new MyRunnable());
            Thread t2 = new Thread(new MyRunnable());

            t0.start();
            t1.start();
            t2.start();

            numero = 42;
            preparado = true;

            while (t0.getState() != Thread.State.TERMINATED ||
                    t1.getState() != Thread.State.TERMINATED ||
                    t2.getState() != Thread.State.TERMINATED) {
            }

            numero = 0;
            preparado = false;
        }
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            while (!preparado) {
                Thread.yield();
            }

            if (numero != 42) System.out.println(numero);

        }
    }
}
