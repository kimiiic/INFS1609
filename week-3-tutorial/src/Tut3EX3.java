import java.util.Scanner;

public class Tut3EX3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's the month? ");

        String month = input.nextLine();
        switch(month) {
            case "September":
            case "september":
            case "SEPTEMBER":
            case "April":
            case "april":
            case "APRIL":
            case "June":
            case "june":
            case "JUNE":
            case "November":
            case "november":
            case "NOVEMBER":
                System.out.println("30 days");
                break;

            case "February":
            case "february":
            case "FEBRUARY":
                System.out.print("Is it a leap year? ");
                String leapYear = input.nextLine();
                if (leapYear.equals("yes")) {
                    System.out.println("29 days");

                } else {
                    System.out.println("28 days");
                }
                break;

            default:
                System.out.println("31 days");
        }
    }
}
