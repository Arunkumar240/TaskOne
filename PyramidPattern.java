package task1;
import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of levels for the pyramid from the user
        System.out.print("Enter the number of levels for the pyramid: ");
        int levels = scanner.nextInt();

        // Generate the pyramid pattern
        for (int i = 1; i <= levels; i++) {
            // Print leading spaces
            for (int j = i; j < levels; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
