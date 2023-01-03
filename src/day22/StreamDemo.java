package day22;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("A");
        stringArray.add("B");
        stringArray.add("C");
        stringArray.add("D");
        stringArray.add("E");
        System.out.println("Original Array : " + stringArray);

        System.out.println("*****Parallel Stream******");
        Stream<String> alphaParallenStream =  stringArray.parallelStream(); //Indirect way tp create STREAM
        //Parallel stream takes multiple values at a time, works fast
        List<String> alphaListParallel= alphaParallenStream
                .peek(System.out::println)  //Intermediate operation, process over stream and returns Stream
                .collect(Collectors.toList());  //Terminal Operator,

        System.out.println("*****Regular Stream******");
        Stream<String> alphaStream =  stringArray.stream(); //Indirect way tp create STREAM
        List<String> alphaList= alphaStream  //collecting as list, storing in alphaList variable
                .peek(System.out::println)  //Intermediate operation, multiple intermediate
                .collect(Collectors.toList());  //Terminal Operator, only one terminal
        System.out.println("AlphaStream List : "+alphaList);

        Stream<Integer> intStream = Stream.of(1,2,3,5,6); //Direct way to create STREAM
//        List<Integer> collectedInt = intStream  //.parallelStream() could be inserted here
//               // .peek(System.out::println)
//                .filter(value -> value % 2 == 0)  //filter() returns boolean value
//               .map(value -> value*10)
//                .collect(Collectors.toList());
//        System.out.println("Collected Int "+ collectedInt);

        long countNumOfEvenNum = intStream.parallel()  //You cannot use already used stream i.e intStream in this case
                .filter(value -> value % 2 == 0)
                .count();
        System.out.println("Count of Even Number : " + countNumOfEvenNum );


        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9,0);

        List<List<Integer>> listOfList =Arrays.asList(list1,list2);//List of list
        List<Integer> listOfAllInteger = listOfList.stream()
                .flatMap(x -> x.stream())//Convert 2 level  of stream into 1 level of stream
                .collect(Collectors.toList());
        System.out.println(listOfAllInteger);







    }
}
