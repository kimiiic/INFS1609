import java.util.Scanner; // Import Scanner class

// Program determines whether a character input is a vowel or not
public class Tut3EX1{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Define new scanner named input

        System.out.print("Enter a char: "); // Prompt ask for character
        char character = input.next().charAt(0); // Store input into 'character' variable

        // If character is a vowel (a (A), e (E), i (I), o (O), u (U)
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("'" + character + "' is a vowel"); // Tell user their input is a vowel
        // If character turns out not to be above
        } else {
            System.out.println("'" + character + "' is not a vowel");
        }
    }

}