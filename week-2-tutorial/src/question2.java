import java.util.Scanner; // Import Java Method for Scanner

public class question2 {
    public static void main(String[] args){
        final double PI = 22.0/7.0; // Set constant as DOUBLE for Pi
        // OR final double PI = (double)(2/7);

        Scanner input = new Scanner(System.in); // Initialise a scanner 'input'

        // Radius
        System.out.print("Enter a circle radius: "); // Prompt for circle's radius
        double radius = input.nextDouble(); // Store radius from next double input

        // Area
        double area = PI * radius * radius; // Calculate the area using Pi*r^2 formula
        System.out.println("Circle area: " + area); // Print out the area of the circle

        // Perimeter
        double perimeter = 2*PI*radius; // Calculate the area using circumference formula
        System.out.println("Circle perimeter: " + perimeter); // Print out circumference of circle
    }
}
