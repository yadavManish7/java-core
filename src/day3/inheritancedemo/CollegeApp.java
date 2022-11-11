package day3.inheritancedemo;

public class CollegeApp {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Reza");

        Student student = new Student();
        student.setName("Manish");
        student.setStatus(Status.ALUMNI);

        Employee employee = new Employee();
        employee.setName("Latha");
        employee.setPhoneNum("986765447");

        Faculty faculty = new Faculty();
        faculty.setName("Thiru");
        faculty.setRank(Rank.PROFESSOR);

        Staff staff = new Staff();
        staff.setName("Arun");
        staff.setTitle(Title.DEPARTMENT_HEAD);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
        System.out.println(faculty);
        System.out.println(employee);


    }
}
