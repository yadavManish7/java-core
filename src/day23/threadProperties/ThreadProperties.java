package day23.threadProperties;

import java.util.logging.Logger;

public class ThreadProperties {
    public static void main(String[] args) {

        Runnable runnable = ()->{
            if(Thread.currentThread().isInterrupted()){
                return;
            }
            Logger.getGlobal().info(Thread.currentThread().getName());
            if(Thread.currentThread().isDaemon()) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Logger.getGlobal().info(String.valueOf(Thread.currentThread().getName()+" :" +Thread.currentThread().isInterrupted()));
        };

        Thread thread = new Thread(runnable);
       // thread.setName("ODD/EVEN");
        Thread thread1 = new Thread(runnable);
        //thread1.setName("FIBONACCI");
        thread1.setDaemon(true);//servant thread, VM will not wait for daemon thread, purpose to help other thread

        Thread thread2 = new Thread(runnable);
        //thread2.setName("PRIME");//Specific name


        thread.start();
        thread1.start();
        thread2.start();

        //thread2.interrupt(); //Is interrupted = trues is not printed




    }
}
