package learnjava;
import java.util.Scanner;

public class UserProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables
        String userName, gender, jobPreference, nationality, bloodType;
        int age;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your name: ");
        userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter your gender: ");
        gender = scanner.next();

        System.out.print("Enter your job preference: ");
        jobPreference = scanner.next();

        System.out.print("Enter your nationality: ");
        nationality = scanner.next();

        System.out.print("Enter your blood type: ");
        bloodType = scanner.next();

        // Calculate the birth year using the entered age
        int birthYear = java.time.Year.now().getValue() - age;

        // Print user information
        System.out.println("\nUser Profile:");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Year of Birth: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Job Preference: " + jobPreference);
        System.out.println("Nationality: " + nationality);
        System.out.println("Blood Type: " + bloodType);

        // Close the scanner to prevent resource leaks
        scanner.close();

	}

}
