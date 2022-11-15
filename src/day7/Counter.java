package day7;

public class Counter {

    public String name;
    public static long count;  //static variable/method is not object specific , belongs to class

    public Counter(String name) {
        this.name = name;
    }

    public static void increaseCount(){
        count++;
    }
    public static void decreaseCount(){
        count--;
    }

    public long getCount(){
        return count;
    }
}
