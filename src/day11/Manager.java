package day11;

import java.time.LocalDate;

//public  sealed class Manager  extends  Staff permits Executive{  //Available in java 17 only
    public class Manager extends Staff{

    private float bonus;

    public Manager(long id, String name, LocalDate hireDate, float salary){
        super(id,name,hireDate,salary);
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public void fireEmployee(){
        //body
    }

    @Override
    public float getSalary() {
        //float baseSalary = super.getSalary();
        return  bonus + super.getSalary(); //getSalary() will result into recursion calling same method over and over
    }

    @Override
    public void getDescription() {
        System.out.println("Description of managers");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", hireDate=" + super.getHireDate() +
                ", salary=" + super.getSalary() +
                ", bonus=" + bonus +
                '}';
    }
}
