import java.util.Scanner;

public class Tut3EX1{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char character = input.next().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("'" + character + "' is a vowel");
        } else {
            System.out.println("'" + character + "' is not a vowel");
        }
    }

}