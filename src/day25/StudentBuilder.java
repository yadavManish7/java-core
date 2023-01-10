package day25;

import javax.swing.plaf.PanelUI;

public class StudentBuilder {

    private Student student;//

    public StudentBuilder(){}


    public StudentBuilder setName(String name){
        student.setName(name);
        return this;  //returns StudentBuilder
    }

    public StudentBuilder setRollNum(int rollNum){
        student.setRollNum(rollNum);
        return this;
    }

    public Student build(){
        return student;
    }

}
