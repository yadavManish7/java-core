package day23;

public class MultithreadingDemo extends  Thread{

    private int threadNum;
    public MultithreadingDemo(int threadNum){
        this.threadNum=threadNum;
    }

    @Override
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println(i + " from thread " + threadNum);
            if(threadNum == 2){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);   //Exception or I/O exception
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
