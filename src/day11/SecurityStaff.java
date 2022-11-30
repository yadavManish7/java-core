package day11;

import java.time.LocalDate;

public class SecurityStaff extends Staff{

    public SecurityStaff(long id, String name, LocalDate hireDate, float salary) {
        super(id, name, hireDate, salary);
    }

    @Override
    public void getDescription() {
        System.out.println("Description of Security");
    }
}
