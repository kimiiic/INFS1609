/*
PROBLEM
* Write a program that ask a user to enter a number, and a character
* then prints a square with those dimensions and character

EXAMPLE OUTPUT
* Please enter a character: &
* Please enter a number: 3
* &&&
* &&&
* &&&
 */

import java.util.Scanner;

public class Tut4EX2{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char character = input.next().charAt(0);

        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print(character);
            }
            System.out.print("\n");
        }
    }

}