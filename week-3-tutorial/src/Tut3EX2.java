import java.util.Scanner;

public class Tut3EX2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if ((double)year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if((double)year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else if((double)year % 4 == 0) {
            System.out.println(year + " is a leap year");
        }else {
        System.out.println(year + " is not a leap year");
    }
}
}