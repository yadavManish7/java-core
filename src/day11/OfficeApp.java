package day11;

import java.time.LocalDate;

public class OfficeApp {
    public static void main(String[] args) {

        Employee employee = new Employee(1,"Manish", LocalDate.now(),5000f);
        System.out.println(employee.toString());

        Manager manager = new Manager(2,"Arun", LocalDate.now(),6000f);
        manager.setBonus(1000f);
        System.out.println(manager.toString());

        System.out.println("Employee salary : "+employee.getSalary());
        System.out.println("Manager salary : "+ manager.getSalary());


        //polymorphism
        //employee showing behavior of staff as well
        Staff staff1 =  new Employee(1,"Anish", LocalDate.now(),5000f); //parent class variable can contain child class object
        Staff staff2 = new Manager(2,"Arun", LocalDate.now(),6000f);
         //staff2.setBonus(); //at compile time jvm will look for setBonus in staff class.
        ((Manager)staff2).setBonus(1000);  //typecasting staff2 to  Manager type. staff2 will convert into manager during runtime

        System.out.println("Staff1 salary : "+ staff1.getSalary());
        System.out.println("Staff2 salary : "+ staff2.getSalary());

        Executive executive = new Executive(4,"Thiru", LocalDate.now(),60000f);

        SecurityStaff securityStaff = new SecurityStaff(3,"Tarun", LocalDate.now(),600f);
        //securityStaff.fireManagers(); //security extends Executive scenario, security cannot fire managers
        //securityStaff.fireEmployee();// security extends Manager scenario, security cannot fire employees



        securityStaff.getDescription();
        employee.getDescription();
        manager.getDescription();
        executive.getDescription();  //calling parent class getDescription method
        //System.out.println(securityStaff.getDescription());  error?






    }
}
