package day6;

import java.time.LocalDate;

public class EmpApp {
    public static void main(String[] args) {

        Employee john = new Employee(null,"001");
        System.out.println(john.getEmpName());
        System.out.println(john.getEmpSalary());
        System.out.println(john);


        Employee mark = new Employee("Mark",27,"002",5000f,null);

        System.out.println(mark.getDateOfHire());
        System.out.println(mark.getEmpName());
        System.out.println(mark);


    }
}
