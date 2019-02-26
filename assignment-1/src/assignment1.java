import java.util.Scanner; // Get scanner
import java.util.StringTokenizer;

public class assignment1 {
    public static void main(String[] args) {
        // SPEC: "accepts 6 numbers
        // Prompt
        System.out.print("Enter 6 digits: ");
        Scanner sc = new Scanner(System.in);

        // Take the input of the next line (6 digits)
        String input = sc.nextLine();

        // Take the input and split into different variables
        // -> Uses space as delimiter to differentiate between numbers
        StringTokenizer st = new StringTokenizer(input, " ");

        int count = 0;
        while(st.hasMoreTokens()) {
            count++;
            first =
        }
        // SPEC: "prints the top 2 numbers"
        //System.out.println(highest, second);
    }
}

// Tests
// INPUT: 7 2 4 10 9 3
// First highest number: 10
// Second highest number: 9

