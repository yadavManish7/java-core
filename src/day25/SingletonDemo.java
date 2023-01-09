package day25;

public class SingletonDemo {
    public static void main(String[] args) {

        SingletonPattern obj1 = SingletonPattern.getInstance(); //
        SingletonPattern obj2 = SingletonPattern.getInstance();//

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
