package day11;

import java.time.LocalDate;


public final class Executive extends Manager{ //final class cannot be inherited Executive class cannot be inherited
        public Executive(long id, String name, LocalDate hireDate, float salary) {
        super(id, name, hireDate, salary);
    }

    public void fireManagers(){
        //body
    }
}
