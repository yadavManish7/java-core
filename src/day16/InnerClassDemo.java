package day16;

public class InnerClassDemo {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.outerVal);

       // outerClass.getInnerClassObject(); //
       // OuterClass.InnerClass innerClass = outerClass. new InnerClass(); // not possible with inner class being private

        OuterClass.InnerClass innerClass = outerClass. new InnerClass(); // creating inner class object
        System.out.println(innerClass.innerVal);

    }
}
