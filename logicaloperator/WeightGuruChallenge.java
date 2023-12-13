package logicaloperator;
import java.util.Scanner;
public class WeightGuruChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String result = interpretBMI(bmi);

        System.out.println("Your BMI is: " + bmi);
        System.out.println("Result: " + result);

        scanner.close();
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    private static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }

	}

}
