package org.example;

public class Main2 {

    static int i = -1;

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

    public static void print() {
        synchronized (Main2.class) {
            i++;
            String thread = Thread.currentThread().getName();
            System.out.println(thread + ":" + i);
        }
    }

    public static class MyRunnable implements Runnable {
        static Object lock1 = new Object();
        static Object lock2 = new Object();

        @Override
        public synchronized void run() {
//        public void run() {
            print();

//            synchronized (this) {
//                print();
//            }

//            synchronized (lock1) {
//                i++;
//                String thread = Thread.currentThread().getName();
//                System.out.println(thread + ":" + i);
//            }
//
//            synchronized (lock2) {
//                i++;
//                String thread = Thread.currentThread().getName();
//                System.out.println(thread + ":" + i);
//            }
        }
    }
}
