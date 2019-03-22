/*
PROBLEM
* Write a program that asks a user for a string, using charAt() print the string back character by character,
* if a vowel is detected, use continue to skip the print.
* Assume all input will be lower case

EXAMPLE OUTPUT
* Enter a string: abcdef
* bcdf
 */

import java.util.Scanner;

public class Tut4EX3{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String userInput = input.nextLine();

        for(int i = 0; i < userInput.length(); i++) {
            if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                continue;
            }
            System.out.print(userInput.indexOf('a'));
            System.out.print(userInput.charAt(i));
        }
    }

}