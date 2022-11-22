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
        System.out.println(String.format("Total marks obtained %.2f",sum));
        float percent = (sum/total)*100;
        System.out.println(String.format("Percentage %.2f", percent) + " %");
        
        scanner.close();
        
        if(percent >= 80){
            System.out.println("You have scored distinction");
        } else if (percent<80 && percent>=70) {
            System.out.println("\"You have scored first division");
        } else if (percent<70 && percent>=60) {
            System.out.println("You have scored second division");
        }else {
            System.out.println("you have just passed");
        }

    }
}
