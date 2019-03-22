/*
PROBLEM
* Write a program that asks a user for a number and continually sum and print the result until the user enters "END"
*
* You will need to use an IF statement to check if the input received contains the word "END"
*
* You will need to use Integer.valueOf(String s) or Integer.parseInt(String s) to convert a string to an integer value

EXAMPLE OUTPUT
* Enter a number: 5
* Sum is now: 5
* Enter a number: 10
* Sum is now: 15
* Enter a number: END
 */

import java.util.Scanner;

public class Tut4EX1{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;

        String userInput = "";

        while(!(userInput.equals("END"))) {
            System.out.print("Enter a number: ");
            userInput = input.nextLine();

            if(!(userInput.equals("END"))) {
                sum += Integer.valueOf(userInput);
                System.out.println("Sum is now: " + sum);
            }

        }
    }

}