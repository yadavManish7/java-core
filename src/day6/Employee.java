package day6;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
    private float salary;
    private LocalDate hireDate;
    private boolean driverLicense;

    public Employee(String name, float salary, LocalDate hireDate) {
        this.name = Objects.requireNonNullElse(name, "Unknown");
        this.salary = salary;
        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());
    }

    public Employee(String name, float salary, LocalDate hireDate, boolean driverLicense) {
      this(name,salary,hireDate); //calling constructor within the same class to reduce code redundancy
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", driverLicense=" + driverLicense +
                '}';
    }
}
