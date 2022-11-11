package day3.inheritancedemo;

public class Employee extends Person{

    private int salary;
    private String dataOfHire;
    private String office;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDataOfHire() {
        return dataOfHire;
    }

    public void setDataOfHire(String dataOfHire) {
        this.dataOfHire = dataOfHire;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dataOfHire='" + dataOfHire + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}
