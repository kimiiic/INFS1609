/*
PROBLEM
* Write a program that prints the alphabet from position n in lower case.
* Assume 'a' starts at position 0.

* You MUST utilise a loop and char casting

EXAMPLE 1
* Starting position: 0
* abcdefghijklmnopqrstuvwxyz

EXAMPLE 2
* Starting position: 9
* jklmnopqrstuvwxyz
*/

import java.util.Scanner;

public class Tut4EX5{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Starting position: ");
        int position = input.nextInt();

        // ascii 'a' is 97
        int letter = 97 + position;
        while(letter <= 122) {
            System.out.print((char)letter);
            letter++;
        }
    }
}