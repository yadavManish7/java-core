package day4;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean output = 7 == 5;
        System.out.println("Output = "+output); // false

        boolean output1 = 7 != 5;
        System.out.println("Output1 = "+ output1);  // true

        int age = 18;

        boolean isAgeValid = age>18;
        System.out.println("isAgeValid = "+isAgeValid);

        boolean isAgeValid1 = age<=18;
        System.out.println("isAgeValid1 = "+isAgeValid1);

        boolean isAgeValid3 = (age>=15)&&(age<10);  // both condition needs to be true
        System.out.println("isAgeValid3 =  "+isAgeValid3);

        boolean isAgeValid4 = (age>=15)||(age<10);  // one condition needs to be true
        System.out.println("isAgeValid4 = "+isAgeValid4);

        String message = (age>=18) ? "Allowed to enter in the club" : "Age not valid";
        System.out.println("Message = "+message);


    }
}
