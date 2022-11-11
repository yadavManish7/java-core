package day3.inheritancedemo;

public class Staff extends Employee{

    private Title title;

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "title=" + title +
                "}";
    }
}
