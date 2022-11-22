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
        System.out.println(isWeekend);

        System.out.println("*****************************************");

        int dayOfWeek=3;

        switch (dayOfWeek){    //switch is faster than if-else
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");


        }
    }
}
