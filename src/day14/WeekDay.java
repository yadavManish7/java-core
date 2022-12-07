package day14;

public enum WeekDay {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7); // all these are STATIC objects

    private int abbr;

    WeekDay(int abbr) {  //to insert primitive value in DB
    this.abbr=abbr;
    }

    public int getAbbr() {  // no setters because sunday,monday are static constant
        return abbr;
    }
}