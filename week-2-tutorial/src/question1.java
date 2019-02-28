import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for name
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println(name);

        // Ask for age
        System.out.print("What is your age? ");
        int age = input.nextInt();
        System.out.println(age);

        // Ask for height
        System.out.print("What is your height? ");
        double height = input.nextDouble();
        System.out.println(height);

        // Final print
        System.out.println(name + " is " + age + " and is " + height + " tall");
    }
}
