package day2;

public class FunctionPractice {

    // int x = 10; variable
    int transType;

    public static void main(String[] args) {

        long principal = 50000; // local variable
        float rate = 6.32f;   //f to denote float type
        int timeInYears = 5;

        calculateInterest(principal, rate, timeInYears);  //

        double calculatedInterestRate = calculateInterest(rate, principal, timeInYears);  // storing returned value into a variable
        System.out.println(calculatedInterestRate);

    }

    static void calculateInterest(long p, float r, int t) {  // does not return any value
        double value = (p * r * t) / 100;
        System.out.println(value);
    }

    static double calculateInterest(float r, long p, int t) {
        return (r * p * t) / 100;
    }

}
