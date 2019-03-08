import java.util.Scanner;

public class Tut3EX4{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side A: ");
        int sideA = input.nextInt();

        System.out.print("Enter side B: ");
        int sideB = input.nextInt();

        System.out.print("Enter side C: ");
        int sideC = input.nextInt();

        // Equilateral
        if (sideA == sideB && sideA == sideC && sideB == sideC) {
            System.out.println("Triangle is equilateral");
        }

        // Isosceles
        else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("Triangle is isosceles");
        }

        // Scalene
        else {
            System.out.println("Triangle is scalene");
        }
    }

}