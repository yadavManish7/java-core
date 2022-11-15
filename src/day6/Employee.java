package day6;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
    private float salary;
    private LocalDate hireDate;

    public Employee(String name, float salary, LocalDate hireDate) {
        this.name=Objects.requireNonNullElse(name,"Unknown");
        this.salary = salary;
        this.hireDate = Objects.requireNonNullElse(hireDate,LocalDate.now());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
