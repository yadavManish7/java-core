package day5;

public class StringConcatenation {
    public static void main(String[] args) {

        String name = "Abc";
        String message = "Hello " +name + ",Good Morning!!";  //Lazy concatenation or not more than 2 small strings
        System.out.println(" Using + operator = "+message);

        String message1 = "Hello ".concat(name).concat(",Good Morning!!");
        System.out.println("Cocat function = "+message1);  // more than 4 5 small strings

        String message3 =String.format("Hello %s, Good Morning!!",name);
        System.out.println("Format function = "+ message3); // when you just need replace one string  l.e email just change name

        StringBuilder builder = new StringBuilder();  // huge strings such as paragraph
        builder.append("Hello ");
        builder.append(name);
        builder.append(", Good Morning!!");
        String message4 = builder.toString();
        System.out.println("Builder class = "+message4);

        //String functions()

        String result=String.join("-","11","11","2022");
        System.out.println("Join() = "+result);
        String rep="Manish ".repeat(5);
        System.out.println("Repeat() = " + rep);

        char c =rep.charAt(2);
        System.out.println("Character at index 3 = " + c );

        String str1 = "abc";
        String str2 = "aab";
        String str3 = "acc";
        String str4 = "acc";
         int value = str1.compareTo(str2);   //Used for sorting acc dec; returns +,0,- value
        System.out.println(value);
        int value1 = str2.compareTo(str3);
        System.out.println(value1);
        int value2 = str3.compareTo(str4);
        System.out.println(value2);

        int result1 = "Abc".compareToIgnoreCase("abc");  //
        System.out.println(result1);

       boolean isHelloInMessage1 =message1.toLowerCase().contains("hello");
        System.out.println("isHelloInMessage1 = "+isHelloInMessage1);

        String empty = "";
        String blank = "     ";

        boolean ans = blank.isBlank(); // checks whitespaces and length both
        boolean ans1 = blank.isEmpty();  //checks length
        System.out.println("Empty = "+ans);
        System.out.println("Blank = "+ans1);

        int len = blank.length();
        System.out.println("length() = " + len);
        int len1 = empty.length();
        System.out.println("length() = " + len1);

        String replace =empty.replace("","hey");
        System.out.println("Replace() = "+replace);

        String demo =empty.concat(replace);       // demo
        System.out.println("Empty concat replace = "+demo);

        String policies = "0393939392,A,250000;097865656,SA,12500";
        String[] policy=policies.split(";");
        String policy1 = policy[0];
        String policy2 = policy[1];
        System.out.println("Policy1 = "+ policy1);
        System.out.println("Policy2 = "+ policy2);

        int a =5;
        String intToStr = String.valueOf(a); //To convert primitive datatype/Obj  into String



    }
}
