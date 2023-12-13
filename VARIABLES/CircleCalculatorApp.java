package learnjava;
import java.util.Scanner;

public class CircleCalculatorApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter the diameter of the circle: ");
        int diameter = scanner.nextInt();

  
        double radius = diameter / 2.0;
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        
        double areaResult = (double) area;
        double perimeterResult = (double) perimeter;

   
        System.out.println("Area of the circle: " + areaResult);
        System.out.println("Perimeter of the circle: " + perimeterResult);

        
        scanner.close();

	}

}
