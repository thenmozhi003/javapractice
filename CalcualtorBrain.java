package function;

public class CalcualtorBrain {

	
		// TODO Auto-generated method stub

	    public static int add(int num1, int num2) {
	        return num1 + num2;
	    }

	    public static int subtract(int num1, int num2) {
	        return num1 - num2;
	    }

	    public static int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    public static double divide(int num1, int num2) {
	        if (num2 != 0) {
	            return (double) num1 / num2;
	        } else {
	            System.out.println("Cannot divide by zero.");
	            return Double.NaN; // Not a Number
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int resultAdd = add(5, 3);
	        System.out.println("Addition: " + resultAdd);

	        int resultSubtract = subtract(8, 3);
	        System.out.println("Subtraction: " + resultSubtract);

	        int resultMultiply = multiply(4, 6);
	        System.out.println("Multiplication: " + resultMultiply);

	        double resultDivide = divide(10, 2);
	        System.out.println("Division: " + resultDivide);

	}

}
