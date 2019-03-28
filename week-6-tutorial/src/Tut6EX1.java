import java.util.Scanner;

public class Tut6EX1{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter array size: ");
        int stringSize = input.nextInt();

        String[] sArray = new String[stringSize];

        for(int i = 0; i < stringSize; i++) {
            System.out.println("Enter element " + (i+1) + ":");

            sArray[i] = input.nextLine();
            System.out.println("");
        }

        for(int i = 0; i < sArray.length; i++) {
            System.out.print(i);
        }
    }

}