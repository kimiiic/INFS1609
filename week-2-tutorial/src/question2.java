import java.util.Scanner;

public class question2 {
    public static void main(String[] args){
        final double PI = 22.0/7.0;

        Scanner input = new Scanner(System.in);

        // Radius
        System.out.print("Enter a circle radius: ");
        double radius = input.nextDouble();

        // Area
        double area = PI * radius * radius;
        System.out.println("Circle area: " + area);

        // Perimeter
        double perimeter = 2*PI*radius;
        System.out.println("Circle perimeter: " + perimeter);
    }
}
