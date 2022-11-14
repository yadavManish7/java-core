package day6;

import java.time.LocalDate;

public class Employee {

    private String empName;
    private int empAge;
    private String empId;
    private float empSalary;
    private LocalDate dateOfHire;

    public Employee(String empName, String empId, float empSalary) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }

    public Employee(String empName, int empAge, String empId, float empSalary, LocalDate dateOfHire) {
        this.empName = empName;
        this.empAge = empAge;
        this.empId = empId;
        this.empSalary = empSalary;
        this.dateOfHire = dateOfHire;
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
    }
}
