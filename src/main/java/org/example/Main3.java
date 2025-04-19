package org.example;

public class Main3 {

    static int i = 0;

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);
        Thread t4 = new Thread(myRunnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            int j;
            synchronized (this) {
                i++;
                j = i * 2;
            }

            double jHigh10 = Math.pow(j, 100);
            double sqrt = Math.sqrt(jHigh10);
            System.out.println(sqrt);

        }
    }
}
