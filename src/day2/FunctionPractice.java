package day2;

public class FunctionPractice {

    // int x = 10; variable

    public static void main(String[] args) {

        long principal = 50000; // local variable
        float rate = 6.32f;   //f to denote float type
        int timeInYears = 5;

        calculateInterest(principal, rate, timeInYears);  // calling a method

        double calculatedInterestRate = calculateInterest(rate, principal, timeInYears);  // storing returned value into a variable
        System.out.println(calculatedInterestRate);

        deposit(calculatedInterestRate);

        bankTransaction(calculatedInterestRate,1);  // to deposit interest
        bankTransaction(500,1);  // to deposit
        bankTransaction(400, 2); // to withdraw

    }

    static void calculateInterest(long p, float r, int t) {  // does not return any value
        double value = (p * r * t) / 100;
        System.out.println(value);
    }

    static double calculateInterest(float r, long p, int t) {
        return (r * p * t) / 100;
    }

    static void deposit(double interest){
        // code to deposit interest rate in your balance
    }

    static void withdraw(double loan){
        // withdraws loan amount from your account balance
    }
    // transType 1 = deposit , 2 = withdraw
    static void bankTransaction(double amount , int transType){

        if (transType == 1){
            deposit(amount);
        }else {
            withdraw(amount);
        }
    }

}
