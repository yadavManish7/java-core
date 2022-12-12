package day11;

import java.time.LocalDate;

public class Employee extends Staff implements Comparable<Employee> {  //inheritance is "is-a" relationships
    //abstract class can extend only one clas,interface can have multiple class, no states but may have CONSTANTS
    //no concrete methods but rarely

    public Employee(long id, String name, LocalDate hireDate,float salary){

        super(id,name,hireDate,salary);
    }

    @Override
    public void getDescription() {
        System.out.println("Description of employee");
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

    @Override
    public int compareTo(Employee o) {
        //To compare we need two Employees, we have only one in this case "o", we are getting other Employee
        //from implicit parameter(this.) -> calling function using the object will replace this
        //class level sorting is used when you sort at multiple places or used more often else go for Comparator<T>

        return this.getId().compareTo(o.getId());
    }
}
