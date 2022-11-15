package day6;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

<<<<<<< HEAD
    private String name;
    private float salary;
    private LocalDate hireDate;

    public Employee(String name, float salary, LocalDate hireDate) {
        this.name=Objects.requireNonNullElse(name,"Unknown");
        this.salary = salary;
        this.hireDate = Objects.requireNonNullElse(hireDate,LocalDate.now());
=======
    private String empName;
    private int empAge;
    private String empId;
    private float empSalary;
    private LocalDate dateOfHire;

    private Employee(){}  //cannot create obj from private constructor

    public Employee(String empName, String empId) {
        this.empName= Objects.requireNonNullElse(empName,"Unknown");  //default empName will be unknown
        this.empId = Objects.requireNonNullElse(empId,"Can not be null");

    }

    public Employee(String empName, int empAge, String empId, float empSalary, LocalDate dateOfHire) {
        this.empName=Objects.requireNonNull(empName,"Unknown"); //NullPointException with message = "Unknown"
        this.empAge = empAge;
        this.empId = empId;
        this.empSalary = empSalary;
        this.dateOfHire =Objects.requireNonNullElse(dateOfHire,LocalDate.now());
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpId() {
        return empId;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
>>>>>>> 6a08cc73b90088a1ffa5fb6fffb38036be1e492a
    }

    @Override
    public String toString() {
        return "Employee{" +
<<<<<<< HEAD
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
=======
                "empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empId='" + empId + '\'' +
                ", empSalary=" + empSalary +
                ", dateOfHire=" + dateOfHire +
>>>>>>> 6a08cc73b90088a1ffa5fb6fffb38036be1e492a
                '}';
    }
}
