package day9;

public class SwitchDemo {
    public static void main(String[] args) {

        String day = "SUNDAY";  //switch can check only one variable . Not multiple cases
        boolean isWeekend=false;
        switch (day){
            case "SUNDAY" :
                isWeekend=true;
                break;
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                isWeekend=false;
                break;
            case "SATURDAY":
                isWeekend = true;
            default:
                System.out.println("Invalid day");
        }
        System.out.println(day + "is weekend = " + isWeekend);

 //       System.out.println("*****************************************");
//        System.out.println("Enhance switch case available in java 17 only");
//
//        int dayOfWeek = 3;
//        switch (dayOfWeek) {    //switch is faster than if-else
//            case 1 -> System.out.println("Sunday");
//            case 2 -> System.out.println("Monday");
//            case 3 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 7 -> System.out.println("Saturday");
//            default -> System.out.println("Invalid day");
//        }
//
//        String day = "SUNDAY";
//        boolean isWeekEnd = switch (day) {
//            case "MONDAY","TUESDAY","WEDNESDAY","FRIDAY" -> false;
//            case "SATURDAY","SUNDAY" -> true;
//            default -> false ;
//        };
//        System.out.println(day+" is weekend "+isWeekEnd);


   }
}
