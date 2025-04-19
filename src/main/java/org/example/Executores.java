package org.example;

import java.util.concurrent.*;

// JAVA MULTITHREAD - Executores Single Thread
public class Executores {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = null;

        // WITH CALLABLE
        try {
            executor = Executors.newSingleThreadExecutor();

            Future<?> future = executor.submit(new TaskWithCallable());

            System.out.println(future.get());

            System.out.println(future.isDone());

            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (executor != null) {
                executor.shutdown();

                //Parada abrupta!
                //executor.shutdownNow();
            }
        }

        // WITH RUNNABLE
//        try {
//            executor = Executors.newSingleThreadExecutor();
//            //executor.execute(new Task());
//
//            Future<?> future = executor.submit(new TaskWithRunnable());
//
//            System.out.println(future.isDone());
//
//            executor.shutdown();
//            executor.awaitTermination(1, TimeUnit.SECONDS);
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (executor != null) {
//                executor.shutdown();
//
//                //Parada abrupta!
//                //executor.shutdownNow();
//            }
//        }
    }

    public static class TaskWithRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Executando tarefa");
        }
    }

    public static class TaskWithCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            String name = Thread.currentThread().getName();
            return name + "Executando tarefa";
        }

    }
}
