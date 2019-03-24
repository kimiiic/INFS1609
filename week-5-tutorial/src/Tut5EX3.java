import java.util.Scanner;

public class Tut5EX3 {

    public static void main(String[] args){
    }


    public static void printCaps(String input) {
        System.out.println(input.toUpperCase());
    }

    public static void printCaps(String input, int num) {
        for(int i=0; i < num; i++) {
            System.out.println(input.toUpperCase());
        }
    }
}