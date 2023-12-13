package controlflow;
import java.util.Scanner;

public class SalesCommissionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt user for sales figure input
        System.out.print("Enter your sales figure: $");
        double salesFigure = scanner.nextDouble();

        // Calculate commission based on the provided sales figure
        double commission = calculateCommission(salesFigure);

        // Print the calculated commission
        if (commission >= 0) {
            System.out.println("Commission: " + commission + "%");
        } else {
            System.out.println("Commission: N/A (Below $1000 in sales)");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Function to calculate commission based on sales figure
    private static double calculateCommission(double sales) {
        if (sales > 10000) {
            return 30.0;
        } else if (sales >= 5001 && sales <= 9999) {
            return 20.0;
        } else if (sales >= 1001 && sales <= 4999) {
            return 10.0;
        } else {
            // No commission for sales below $1000
            return -1.0;
        }

	}

}
