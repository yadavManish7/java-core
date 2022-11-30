package day11;

import java.time.LocalDate;

public class Staff {

    private long id;
    private String name;
    private LocalDate hireDate;
    private float salary;

    public Staff(long id, String name){
        this.id=id;
        this.name=name;
    }

    public Staff(long id, String name,LocalDate hireDate,float salary){
        this( id,name);
        this.hireDate=hireDate;
        this.salary=salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }
}
