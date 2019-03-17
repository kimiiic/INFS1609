/*
PROBLEM
* Write a program that asks a user for a string, using charAt() print the string back character by character,
* if a vowel is detected, use break to stop the print.
* Assume all input will be lower case

EXAMPLE
* Enter a string: bcfgrtyhehdsfhsdhf
* bcfgrtyh
 */

import java.util.Scanner;

public class Tut4EX4{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        for(int i = 0; i < userInput.length(); i++) {
            if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                break;
            }
            System.out.print(userInput.charAt(i));
        }
    }

}