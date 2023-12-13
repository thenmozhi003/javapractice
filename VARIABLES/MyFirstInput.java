package learnjava;
import java.io.Console;

public class MyFirstInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		   System.out.println("Please enter your name ");
		   String name = console.readLine();

		   System.out.println("My name is "+ name);

	}

}
