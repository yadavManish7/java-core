package day3.inheritancedemo;

public class Faculty extends Employee{

    private String officeHr;
    private Rank rank;

    public String getOfficeHr() {
        return officeHr;
    }

    public void setOfficeHr(String officeHr) {
        this.officeHr = officeHr;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" + "name=" + getName() + ", phoneNum=" + getPhoneNum() +
                ", officeHr='" + officeHr + '\'' +
                ", rank=" + rank +
                '}';
    }
}
