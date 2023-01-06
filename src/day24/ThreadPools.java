package day24;


import java.util.concurrent.*;


public class ThreadPools {
    public static void main(String[] args) {
        //newCachedThreadPool -> New Threads are created, keeps running for 60 sec
        //*newFixedThreadPool -> Need to fix the thread at the beginning, depends upon OS processor, thread reuse tasks
        //*newSingleThreadExecutor -> Executes submitted task sequentially, might be requirement

        Runnable task1 = () -> {
            System.out.println("Task1");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        };
        Runnable task2 = () -> {
            System.out.println("Task-2");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        };
        Runnable task3 = () -> {
            System.out.println("Task-3");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        };
        Runnable task4 = () -> {
            System.out.println("Task-4");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        };


        ExecutorService executorService = Executors.newFixedThreadPool(3);
       // ExecutorService executorService = Executors.newCachedThreadPool();//Run for 60 sec
        //ExecutorService executorService = Executors.newSingleThreadExecutor(); // Run sequentially
        executorService.submit(task1);//you can pass RUNNABLE and CALLABLE
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4); // executes after finishing any one of task1,task2,task3

        //executorService.shutdown();


        //Executor service does  queueing tasks, creating threads


        Callable<Integer> task5 = () -> {  //Return type is needed, returns some value
            System.out.println("Callable executed");
            int temp = 5+5;
            return temp;

        };

        Future<Integer> reasutTask5  =executorService.submit(task5);//Returns FUTURE<>, important
        try {
            int sum  =reasutTask5.get();//future method to get value
            System.out.println("Sum : " + sum);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();

        System.out.println("Code Executed");


    }
}
