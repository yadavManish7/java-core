package day23;

import java.sql.SQLOutput;
import java.util.logging.Logger;

public class ThreadDemo {
    public static void main(String[] args) {
        //Old way to create an object of an Interface is by creating class and implementing Runnable interface, and creating
        //object of that class

//        Runnable r = new Runnable() {   Another way of creating OBJECT of Runnable Interface
//            @Override
//            public void run() {
//
//            }
//        }
        //Using Runnable, it cannot return anything
        Runnable r = ()->{  //Using Lambda expression
            //System.out.println(Thread.currentThread().getName());
            Logger.getGlobal().info(Thread.currentThread().getName());  //getting called at once in Thread
            //Always use Synchronized List
            //Best to use Immutable class with thread


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        //Thread is a request to OS
        Thread t1 = new Thread(r); //Created Object of Thread
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);

        t1.start();  //Does not mean started, it goes to OS Queue.Also called RUNNABLE
        t2.start();
        t3.start();
        t4.start();

        ThreadByCreatingClass threadByCreatingClass = new ThreadByCreatingClass();  //By creating Thread class
        threadByCreatingClass.start();


        //Blocked State -> Waits until thread gets key
        //Waiting -> Preemptive scheduling - OS gives limited time to complete task - if not completed, wait for his turn
        //Time waiting -> Os calls or set time to do task

    }
}
