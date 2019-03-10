import java.util.Scanner; // Import Scanner class

// Program determines whether an input year is a leap year or not
public class Tut3EX2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Define new scanner as 'input'

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // If year is divisible by 400
        if ((double)year % 400 == 0) {
            System.out.println(year + " is a leap year");
        // If year is divisible by 100
        } else if((double)year % 100 == 0) { // Then it's not a leap year
            System.out.println(year + " is not a leap year");
        // Alternatively, if it is divisible by 4
        } else if((double)year % 4 == 0) { // Then it is a leap year
            System.out.println(year + " is a leap year");
        // If none of the above are met
        } else { // It isn't a leap year
        System.out.println(year + " is not a leap year");
    }
}
}