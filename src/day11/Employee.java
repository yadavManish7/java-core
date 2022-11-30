package day11;

import java.time.LocalDate;

public class Employee extends Staff  {  //inheritance is "is-a" relationships

    public Employee(long id, String name, LocalDate hireDate,float salary){
        super(id,name,hireDate,salary);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" +getId() +
                ", name='" + getName() + '\'' +
                ", hireDate=" + getHireDate() +
                ", salary=" + getSalary() +
                '}';
    }

}
