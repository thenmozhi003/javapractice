package controlflow;
import java.util.Scanner;

public class MovieTicketPricing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt user for age input
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        // Calculate ticket price based on age conditions
	        double ticketPrice = calculateTicketPrice(age);

	        // Print the calculated ticket price
	        System.out.println("Ticket Price: " + ticketPrice + " Euros");

	        // Close the scanner to prevent resource leaks
	        scanner.close();
	    }

	    // Function to calculate ticket price based on age
	    private static double calculateTicketPrice(int age) {
	        if (age < 5) {
	            // 60% discount for age below 5
	            return 0.4 * 7;
	        } else if (age >= 60) {
	            // 55% discount for age over 60
	            return 0.45 * 7;
	        } else {
	            // Normal ticket price for other ages
	            return 7.0;
	        }

	}

}
