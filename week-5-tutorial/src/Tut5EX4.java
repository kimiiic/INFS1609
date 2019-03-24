import java.util.Scanner;

public class Tut5EX4 {

    public static void main(String[] args){
    }

    public static int sumDigits(int digits) {
        int sum = 0;
        int number = 0;

        while(digits != 0) {
            number = digits % 10;
            sum += number;
            digits /= 10;
        }
        return sum;
    }
}