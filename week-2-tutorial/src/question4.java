import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        int population = 25197902;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter minutes elapsed: ");
        double totalTime = input.nextInt();

        double births = totalTime/(1.0+(40.0/60.0));
        double deaths = totalTime/(3.0+(16.0/60.0));
        double arrivals = totalTime/(57.0/60.0);
        double departures = totalTime/(1.0 + (49.0/60.0));
        //System.out.println(births);
        //System.out.println(deaths);
        System.out.println(arrivals);
        System.out.println((int)deaths);
        System.out.println(population);

        // Work out difference in population
        population = population + (int)births - (int)deaths + (int)arrivals - (int)departures;

        System.out.print("Population is now: " + population);
    }
}
