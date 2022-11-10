package day5;

public class StringConcatenation {
    public static void main(String[] args) {

        String name = "Abc";
        String message = "Hello " +name + ",Good Morning!!";
        System.out.println(" Using + operator = "+message);

        String message1 = "Hello ".concat(name).concat(",Good Morning!!");
        System.out.println("Cocat function = "+message1);

        String message3 =String.format("Hello %s, Good Morning!!",name);
        System.out.println("Format function = "+ message3);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append(name);
        builder.append(", Good Morning!!");
        String message4 = builder.toString();
        System.out.println("Builder class = "+message4);
    }
}
