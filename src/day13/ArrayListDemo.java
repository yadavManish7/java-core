package day13;

import day11.Employee;

import java.time.LocalDate;
import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList intList = new ArrayList(); // we are not defining type of ArrayList to it stores objects by default
        intList.add(2);   //AutoBoxing applied
        intList.add("Manish");

        Object test = 2 ;  // 2 will be cast to int class object

        Integer zeroPosition =(Integer) intList.get(0);  // get returns object

        ArrayList<String> list = new ArrayList(10);  //up to 10 data will not be copied , to optimize
        //list.add(2);  //only string
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F");
        String zeroIndex = list.get(0);     //Returns string only because Arraylist type is String

        System.out.println(list);
        list.add(4,"E");
        list.add(6,null);
        list.add(7,"J");
        System.out.println(list);


        ArrayList<String> copyList = new ArrayList<>(list); // creates new arraylist and put old arraylist into it
        System.out.println(copyList);

        copyList.add(6,"G");  // push remaining element
        System.out.println(copyList);
        copyList.set(7,"H");
        System.out.println(copyList);  // this will update

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new day11.Employee(1,"Manish", LocalDate.now(),500f));
       employees.add(new Employee(2,"Mani", LocalDate.now(),5000f));
       employees.add(new Employee(3,"Man", LocalDate.now(),50000f));

       boolean contains = employees.contains(new Employee(2,"Manish", LocalDate.now(),5000f));
        System.out.println(contains);  // true when hasCode and equal method is called












    }
}
