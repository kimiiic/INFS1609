import java.util.Scanner; // Import Java Method for Scanner

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Initialise scanner as 'input'

        System.out.print("Enter the number of seconds: "); // Prompt for number of seconds required

        int seconds = input.nextInt(); // Set seconds (initially equal to the total time as input)

        // Hours
        int hours = seconds / 3600; // Hours are calculated as the totalTime / 3600 (by definition)
        seconds %= 3600; // Total time is reduced by the number of hours

        // Minutes
        int minutes = seconds / 60; // Minutes are calculated as the current totalTime / 60
        seconds %= 60; // Total time is reduced to the remainder (seconds left)

        // Seconds is the remainder and automatically generated :)

        // Print statements from the conversion
        System.out.println("Contains: " + hours + " hour(s)");
        System.out.println("Contains: " + minutes + " minute(s)");
        System.out.println("Contains: " + seconds + " second(s)");
    }
}
