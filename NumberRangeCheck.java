package task1;
import java.util.Scanner;

public class NumberRangeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is within the range 10 to 50 (inclusive)
        if (number >= 10 && number <= 50) {
            System.out.println("The number is within the range of 10 to 50.");
        } else {
            System.out.println("The number is outside the range of 10 to 50.");
        }

        scanner.close();
    }
}
