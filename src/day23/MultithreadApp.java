package day23;

public class MultithreadApp {
    public static void main(String[] args) {

//        for(int i=1;i<=4;i++){
//            MultithreadingDemo multithreadingDemo = new MultithreadingDemo(i);
//            multithreadingDemo.start();
//        }

        ThreadingInterface threadingInterface = new ThreadingInterface();
        Thread t1 = new Thread(threadingInterface);
        Thread t2 = new Thread(threadingInterface);

        t1.start();
        t2.start();


//        MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
//        MultithreadingDemo multithreadingDemo2 = new MultithreadingDemo();
//        multithreadingDemo.start();
//        multithreadingDemo2.start();
    }
}
