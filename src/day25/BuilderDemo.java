package day25;

public class BuilderDemo {
    public static void main(String[] args) {
        Student student1 = new StudentBuilder()
                .setName("Manish")
                .setRollNum(07)
                .build();

        StudentBuilder studentBuilder = new StudentBuilder()
                .setName("Manish")
                .setRollNum(07);

        Student student3 = studentBuilder.build();//Returns Student obj at the end


    }


}
