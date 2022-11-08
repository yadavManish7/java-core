package day3.inheritance;

public class Student extends Person { // extends public functions,fields,getter/setter


    private String studentClass;
    private int rollNum;



    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }


    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}
