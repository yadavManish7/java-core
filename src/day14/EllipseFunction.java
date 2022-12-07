package day14;

import java.util.Arrays;

public class EllipseFunction {
    public static void main(String[] args) {

        String message=String.format("Hello %s,Welcome to java class.Your balance is $%d.","Manish",100);
        System.out.println(message);

        add(2,3);  // regular function
        add(1,2,3,4);  //dynamic function
        sum(3,4,5);
    }

    public static void add(int a , int b){
        int temp = a+b;
        System.out.println("Normal parameter =  "+temp);
    }

    public static void add(int... numbers){
        int sum = 0;
        for ( int number : numbers) {  //since number variable is array, you can use forEach loop
            sum += number;
        }
        System.out.println("Ellipse parameter sum = "+sum);
    }

    public static void sum(int... numbers){  // ellipse variable contains array
        System.out.println(Arrays.toString(numbers));
    }
}
