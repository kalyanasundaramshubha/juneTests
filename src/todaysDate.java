import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class todaysDate {
    public static void main(String[] arguments) {

        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

        if (hour > 12) {
            System.out.println("Its PM now");
        } else {
            System.out.println("Good Morning");
        }
        if (minute != 0) {
            System.out.println("Its " + minute);
            System.out.println((minute != 0) ? "minutes" : "minute");

        }
        System.out.println((hour > 12) ? (hour - 12) : hour);
        System.out.println("o clock");

        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("not a valid number");

        }
        System.out.println(day + " " + year + " ");

    }
}






