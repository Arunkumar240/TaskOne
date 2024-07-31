package task1;

public class LogicalOperator {

	public static void main(String[] args) {
		
		        int number = 15;
		        
		        if (isGreaterThan10(number) && isLessThan20(number)) {
		            System.out.println("The number is greater than 10 and less than 20.");
		        } else {
		            System.out.println("The condition is not met.");
		        }
		    }

		    public static boolean isGreaterThan10(int num) {
		        System.out.println("Checking if number is greater than 10...");
		        return num > 10;
		    }

		    public static boolean isLessThan20(int num) {
		        System.out.println("Checking if number is less than 20...");
		        return num < 20;
		    }
		}


	
