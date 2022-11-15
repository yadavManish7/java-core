package day6;

import java.time.LocalDate;

public class OfficeApp {
    public static void main(String[] args) {
        Employee employee = new Employee(null,5000.86f, LocalDate.of(2021,7,27));
        System.out.println(employee);

        Employee employee1 = new Employee("Mike",50000f,LocalDate.now(),true);
        System.out.println(employee1);
    }


}
