package scanner;
import java.util.Scanner;

		public class VotingEligibility {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Get the age from the user
		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();

		        // Get the citizenship status from the user
		        System.out.print("Are you a citizen of the country? (yes/no): ");
		        String citizenship = scanner.next();

		        // Check if the person is eligible to vote
		        if (age >= 18 && citizenship.equalsIgnoreCase("yes")) {
		            System.out.println("You are eligible to vote.");
		        } else {
		            System.out.println("You are not eligible to vote.");
		        }

		        scanner.close();
		    }


	}


