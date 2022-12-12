package day15;

import day11.Employee;

import java.time.LocalDate;

public class InterfaceProperties {
    public static void main(String[] args) {
       // Comparable<Employee> comparable = new Comparable();  //cannot create OBJ directly of INTERFACE

        Comparable<Employee> comparable = new ComparableImpl(); //Traditional way to create Obj of Interface by creating class
        // you need comparable Obj in many places
        // use classes to create Obj

        Comparable<Employee> comparable1 = new Comparable<Employee>() {  //creating Obj without creating CLASS, calling function itself
            @Override
            public int compareTo(Employee o) {
                return 0;
            }
        };

        Comparable<Employee> comparable2 = o -> 0; //same as comparable1, using lambda


    }
}
