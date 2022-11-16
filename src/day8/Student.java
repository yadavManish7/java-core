package day8;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name? ");
        String name = scanner.nextLine();

        System.out.println("Enter your marks for following subjects");
        System.out.print("Math = ");
        float math = scanner.nextFloat();
        System.out.print("Science = ");
        float science = scanner.nextFloat();
        System.out.print("History = ");
        float history = scanner.nextFloat();
        System.out.print("Social = ");
        float social = scanner.nextFloat();
        System.out.print("Java = ");
        float java = scanner.nextFloat();

        int total = 500;
        float sum = math+science+history+social+java;
        System.out.println("Total marks obtained = " + sum);
        float percent = (sum/total)*100;
        System.out.println("Percentage = " + percent + "%");

        scanner.close();
    }
}
