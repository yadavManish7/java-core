package day3.inheritance;

public class SchoolApp {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Mike");
        student1.setAge(18);
        student1.setRollNum(1);

        Teacher teacher1 = new Teacher();
        teacher1.setName("Denis");
        teacher1.setAge(35);
        teacher1.setSubject("core java");

        Staff staff1 = new Staff();
        staff1.setName("John");
        staff1.setAge(47);
        staff1.setDepartment("Business");




    }
}
