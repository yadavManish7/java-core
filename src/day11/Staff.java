package day11;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Staff {   //we do not make objects from base class to prevent make class ABSTRACT
                               //You cannot make object from abstract class

    private long id;
    private String name;
    private LocalDate hireDate;
    private float salary;

    public Staff(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Staff(long id, String name, LocalDate hireDate, float salary) {
        this(id, name);
        this.hireDate = hireDate;
        this.salary = salary;
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

    public abstract void getDescription(); //abstract function must be implemented by child classes
    //abstract function must be inside abstract class

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return id == staff.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
