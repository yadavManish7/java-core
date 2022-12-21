package day19;

import java.util.Arrays;

public class GenericDemo {
    public static void main(String[] args) {

        //non-generic way by making states OBJECT type

        //Pair namePair = new Pair("name","Manish");
       //Pair agePair = new Pair("age",20);   //int value is saved to OBJECT because of AUTOBOXING (int) -> INTEGER
       //Pair presentPair = new Pair("isPresent",true);

        //String name =namePair.getValue();  //Not possible because Child class Object(STRING) cannot hold Parent class object(OBJECT)
        //String name =(String) namePair.getValue(); // Typecasting is required if you are not applying GENERIC

        Pair<String,String> namePair = new Pair<>("name","Manish");
       Pair<String,Integer> agePair = new Pair<>("age",20);
       Pair<String,Boolean> presentPair = new Pair<>("isPresent",true);

        String name =namePair.getValue();
        Integer age =agePair.getValue();

        int number = agePair.getValue(); // Auto UnBoxing -> (INTEGER) into int

        Integer[] numArr= {0,1,2,3,4,5}; //Must be a class of type Integer not int
        printArray(numArr);

        Float[] numAr2r= {10f,11f,12f,13f,14f,15f}; //Must be a class of type Float not float
        printArray(numArr);

        String[] alphabets = {"A","B","C","D"};
        printArray(alphabets);

        Test[] tests = {new Test(),new Test(),new Test()};

        maximum(1,2,3);
        maximum("A","C","D");
        maximum(new Test(),new Test(),new Test());
        //maximum(new Test(),new Test(),new Test()); //Throw error when Comparable interface is not implemented by Test class
    }
        // non-generic way
//    public static void printArray(int[] intTypeArray){
//        System.out.println(Arrays.toString(intTypeArray));
//    }
//    public static void printArray(String[] stringTypeArray){
//        System.out.println(Arrays.toString(stringTypeArray));
//    }


    public static <T>void printArray(T[] genericTypeArray){
        System.out.println(Arrays.toString(genericTypeArray));
    }
    //Bounding of Type variable <T>
    public static <T extends Number> void addArray(T[] numbers){ //T must be of type that has Number as a parent class
       // for (:) {}
    }
    //Bounding of Type variable <T>
    public static <T extends Comparable<T>> T maximum(T x, T y , T z){
        //Type T can only have parameter which has Comparable extended
        //Return type is T because it will return the type of parameter you pass
        //multiple bounding can be applied l.e extends Comparable<T> & Serializable
        T max = x ;  //assume X is the largest number initially

        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

    //JVM does not know there is GENERIC mechanism. Compiler removes type parameter before sending to JVM but it
    //still remembers.

    //class Pair<T>{
    // private T getKey();
    // private T getKey();
    //}

    //Type erasing when not bounded, if bounded it will replace with Comparable
    //class Pair<Object>{
    // private Object getKey();
    // private Object getKey();
    //}


}
