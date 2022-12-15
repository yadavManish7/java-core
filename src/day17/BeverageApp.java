package day17;

public class BeverageApp {
    public static void main(String[] args) {

        User user = new User("abc@gmail.com","abc7","12345",10);

        try {
            user.registerUser();
        } catch (AgeRestrictionException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block get called either error occur or not");
        }
    }
}
