import java.util.Scanner;

public class Tut5EX4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string of numbers: ");
        int numbers = input.nextInt();

        System.out.println("The sum of the digits in your string adds up to " + sumDigits(numbers));
    }

    public static int sumDigits(int digits) {
        int sum = 0;
        int number = 0;

        while(digits != 0) {
            number = digits % 10;
            sum += number;
            digits /= 10;
        }
        return sum;
    }
}