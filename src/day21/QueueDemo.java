package day21;

import day20.Queue;

import java.util.PriorityQueue;


public class QueueDemo {
    public static void main(String[] args) {
//        ArrayDeque<String> usersNames = new ArrayDeque<>();
//        usersNames.add("Ram");
//        usersNames.add("Shyam");
//        usersNames.addFirst("Manish");
//
//        System.out.println(usersNames);
//       // System.out.println(usersNames.peek());  //returns null if queue is empty
//        //System.out.println(usersNames.element());  //throws exception
//        System.out.println(usersNames.poll()); // removes data from top
//        System.out.println(usersNames);

        PriorityQueue<String> usersNames1 = new PriorityQueue<>(); //follows insertion order at the beginning
        usersNames1.add("A");
        usersNames1.add("D");
        usersNames1.add("C");
        usersNames1.add("E");
        //usersNames1.addFirst("Manish"); not available in PriorityQueue

        System.out.println(usersNames1);
        System.out.println(usersNames1.poll());  // Removes top data and does not maintain insertion order
        System.out.println(usersNames1);
        System.out.println(usersNames1.peek());
        System.out.println(usersNames1);


    }
}
