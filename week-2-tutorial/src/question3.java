import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");

        int totalTime = input.nextInt();

        // Hours
        int hours = totalTime / 3600;
        totalTime -= hours*3600;

        // Minutes
        int minutes = totalTime / 60;
        totalTime -= minutes*60;

        // Seconds
        int seconds = totalTime;

        System.out.println("Contains: " + hours + " hour(s)");
        System.out.println("Contains: " + minutes + " minute(s)");
        System.out.println("Contains: " + seconds + " second(s)");
    }
}
