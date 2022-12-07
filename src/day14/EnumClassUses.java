package day14;

import java.util.EnumSet;

public class EnumClassUses {
    public static void main(String[] args) {

        System.out.println(WeekDay.WEDNESDAY);  //Calling using class name because it is STATIC Object
        System.out.println(WeekDay.SATURDAY.getAbbr());

        EnumSet<WeekDay> weekDaysList = EnumSet.allOf(WeekDay.class);  // to get a list similar to arraylist
        System.out.println("List of WeekDay "+weekDaysList);

        EnumSet<WeekDay> workingDays = EnumSet.range(WeekDay.MONDAY,WeekDay.FRIDAY);
        System.out.println("List of workingDays "+workingDays);

        EnumSet<WeekDay> specificDays = EnumSet.of(WeekDay.MONDAY,WeekDay.WEDNESDAY,WeekDay.FRIDAY);
        System.out.println("List of specific days "+specificDays);

        EnumSet<WeekDay> chosenDay = EnumSet.noneOf(WeekDay.class); // empty enum set, add elements later
        chosenDay.add(WeekDay.FRIDAY);
        System.out.println("Empty enum set "+chosenDay);

        System.out.println(WeekDay.SATURDAY.ordinal());  // to get position

        saveToDataBase(workingDays);

    }

    public static void saveToDataBase(EnumSet<WeekDay> workingDays){  // to save into DB
        for (WeekDay workingDay:workingDays) {
            System.out.println(workingDay.getAbbr());
        }
    }
}
