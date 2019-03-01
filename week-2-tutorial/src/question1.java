import java.util.Scanner; // Import Java Method for Scanner

public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Initialise new scanner 'input'

        // Ask for name
        System.out.print("What is your name? "); // Prompt for name
        String name = input.nextLine(); // Store name from next line

        // Ask for age
        System.out.print("What is your age? "); // Prompt for age
        int age = input.nextInt(); // Store age from next integer entered

        // Ask for height
        System.out.print("What is your height? "); // Prompt for height
        double height = input.nextDouble(); // Store height from next double passed

        // Final print
        System.out.println(name + " is " + age + " and is " + height + " tall"); // Print statement about person
    }
}
