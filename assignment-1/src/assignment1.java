import java.util.Scanner; // Get scanner from java.util

public class assignment1 {
    public static void main(String[] args) {
        // Specification: 'Accept 6 digits'
        // User Prompt
        System.out.print("Enter 6 digits: "); // Prompts user to enter 6 digits
        Scanner sc = new Scanner(System.in); //Initialise Scanner object 'sc'

        // Take the input of the next line (6 digits) and assign to 'input'
        String input = sc.nextLine(); // Reads the whole line input from user (nextLine)

        int i = 0; // Tracker - maintains position in the loop
        int[] array = new int[6]; // Initialise 'array' and allocate 24 bytes

        for (String element: input.split(" ")) { // Identifies separate integers using space delimiter
            array[i] = Integer.parseInt(element); // Sets array index to element in string
            i++; // Increment tracker in loop
        }

        // Sorts the array from LOWEST to HIGHEST (e.g. 3, 12, 54, 66, 128, 300)
        java.util.Arrays.sort(array);

        // (Test) Prints the array
        // System.out.println(java.util.Arrays.toString(array));

        // Prints the result (first and second highest numbers) on separate lines
        System.out.println("First highest number: " + array[5]);
        System.out.println("Second highest number: " + array[4]);
    }
}