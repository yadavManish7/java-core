package day3.polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {

        add(2,3f);

    }
    public static void add(int a, int b){
        int temp = a + b;
        System.out.println("sum of int  = " + temp);
    }
    public static void add(float c, float d){
        float temp = c + d;
        System.out.println("sum of float = " + temp);
    }
    public static void add(float e, int f){
        float temp = e + f;
        System.out.println("sum of float/int = " + temp);
    }
}
