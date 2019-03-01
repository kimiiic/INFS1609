import java.util.Scanner; // Import Java Method for Scanner

public class question4 {
    public static void main(String[] args) {
        int population = 25197902; // Set population as integer given

        Scanner input = new Scanner(System.in); // Initialise scanner as 'input'

        System.out.print("Enter minutes elapsed: "); // Prompt user to enter minutes elapsed
        double totalTime = input.nextInt(); // Store the total time (minutes)

        // Calculations: taken as the total time in minutes divided over the RATE things occur
        double births = totalTime/(1.0+(40.0/60.0));
        double deaths = totalTime/(3.0+(16.0/60.0));
        double arrivals = totalTime/(57.0/60.0);
        double departures = totalTime/(1.0 + (49.0/60.0));

        // Work out difference in population
        population = population + (int)births - (int)deaths + (int)arrivals - (int)departures;

        System.out.print("Population is now: " + population);
    }
}
