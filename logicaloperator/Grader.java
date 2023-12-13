package logicaloperator;
import java.util.Scanner;

public class Grader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the student's grade (0-10): ");
        int grade = scanner.nextInt();

       
        if (grade < 0 || grade > 10) {
            System.out.println("Invalid grade entered. Please enter a grade between 0 and 10.");
        } else if (grade <= 3) {
            System.out.println("Failed");
        } else if (grade <= 5) {
            System.out.println("Insufficient");
        } else if (grade <= 8) {
            System.out.println("Good");
        } else if (grade == 10) {
            System.out.println("Excellent Grade");
        }

    
        scanner.close();

	}

}
