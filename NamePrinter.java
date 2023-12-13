package function;
import java.util.Scanner;

public class NamePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        // Call the functions with the provided TODO comments
        printNameLength(firstName);
        printNameCharacters(firstName);

        // Prompt user for the last name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        // Call the additional function for printing the full name
        printFullName(firstName, lastName);
    }

    private static void printNameLength(String name) {
        System.out.println("Name length: " + name.length());
    }

    private static void printNameCharacters(String name) {
        System.out.print("Name characters: ");
        for (char c : name.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Full name: " + firstName + " " + lastName);

	}

}
