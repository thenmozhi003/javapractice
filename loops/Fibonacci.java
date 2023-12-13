package loops;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt user for n
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        // Validate n is non-negative
	        if (n < 0) {
	            System.out.println("Please enter a non-negative integer.");
	            return;
	        }

	        // Calculate Fibonacci(n) using a do-while loop
	        int a = 0, b = 1, count = 0;
	        System.out.println("Fibonacci sequence up to n=" + n + ":");
	        
	        do {
	            System.out.print(a + " ");
	            int sum = a + b;
	            a = b;
	            b = sum;
	            count++;
	        } while (count <= n);

	        // Close the scanner
	        scanner.close();
	    
	
		

	}

}
