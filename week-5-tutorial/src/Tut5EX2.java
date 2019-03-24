import java.util.Scanner;

public class Tut5EX2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String aString = input.nextLine();
        replacePrint(aString);
    }


    public static void replacePrint(String input) {
        for(int i=0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || input.charAt(i) == 'e' || input.charAt(i) == 'E' || input.charAt(i) == 'i' || input.charAt(i) == 'I' || input.charAt(i) == 'o' || input.charAt(i) == 'O' || input.charAt(i) == 'u' || input.charAt(i) == 'U') {
                System.out.print("*");
                continue;
            }
            System.out.print(input.charAt(i));
        }
        System.out.print("\n");
    }
}