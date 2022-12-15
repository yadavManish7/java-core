package day17;

public class AssertionDemo {
    public static void main(String[] args) {

        int x = getX();
//        if(x > 0) {    // if condition consumes time
//            double y = Math.sqrt(x);
//            System.out.println(y);
//        }

            assert  x > 0 : "Error message";    //Tester uses most of the time,you can enable and disable assertion
        //assertion class is an error class
            double y = Math.sqrt(x);
            System.out.println(y);

    }

    public static int getX(){
        return 1;
    }
}
