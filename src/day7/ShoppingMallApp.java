package day7;

public class ShoppingMallApp {
    public static void main(String[] args) {  //JVM creates objects automatically,
                                                // objects creation is done after the main method

        Counter door1 = new Counter("door1");
        Counter door2 = new Counter("door2");
        Counter door3 = new Counter("door3");
        Counter door4 = new Counter("door4");

        Counter.increaseCount();  //static method
        Counter.increaseCount();

        Counter.decreaseCount();

        System.out.println("Door1 = "+door1.getCount());  //getCount is not static
        System.out.println("Door2 = "+door2.getCount());
        System.out.println("Door3 = "+door3.getCount());
        System.out.println("Door4 = "+door4.getCount());
    }

}
