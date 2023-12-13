package loops;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 Scanner console = new Scanner(System.in);
			        int num;
			        
			        System.out.print("Enter any positive integer: ");
			        num = console.nextInt();
			                
			        System.out.println("Multiplication Table of " + num);
			        
			        int i = 1;
			        while (i <= 10) {
			        	int result = num * i;
			        	System.out.println(num + " * " + i + " = "  + result);
			        	i++;
			        	
			        }

	}

}
