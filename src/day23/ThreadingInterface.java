package day23;

public class ThreadingInterface implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
