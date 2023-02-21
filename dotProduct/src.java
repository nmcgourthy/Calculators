package Calculator;
import java.util.*;
public class DotProduct {
	
	public static void main(String[] args) {
		int size = prompt();
		Calculate(size);
	}
	public static int prompt() {
		
		System.out.println("What is the size of your two vectors(Atleast 2)");
		int size = 0;
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		// Initialize cont as this will be used to decide if prompts to user should continue based on criteria.
		
		do {
		try {
			size = input.nextInt();
			if(size >= 2) {
				cont = true;
			} else {
				System.out.println("Vector size must be 2 or more.");
				cont = false;
				// Make loop run through again to prompt for correct size
				
			}
			
			
		} catch(InputMismatchException e) {
			System.out.println("Size must be an integer!");
			cont = false;
			input.nextLine();
		}} while(!cont);
		
		return size;
	}
	public static void Calculate(int size) {
		boolean cont = true;
		
		int[] vector1 = new int[size];
		int[] vector2 = new int[size];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i < size ; i ++) 
		// Loop to run through each vector variable and prompt for input.
		{
		do {
			// Do-while loop to prompt user each variable until integer is entered.
			try {
				System.out.println("Vector 1, varibable " + i + ":");
				vector1[i] = input.nextInt();
				
				cont = true;
			} catch(InputMismatchException e) {
				System.out.println("Vector value must be an integer");
				cont = false;
				input.nextLine();
			}
		} while(!cont);
		}
		
		for(int i = 0 ; i < size ; i ++) 
			// Loop to run through each vector variable and prompt for input.
			{
			do {
				// Do-while loop to prompt user each variable until integer is entered.
				try {
					System.out.println("Vector 2, varibable " + i + ":");
					vector2[i] = input.nextInt();
					// Input for each variable in vector
					cont = true;
					// Line is only read if there is no error
				} catch(InputMismatchException e) {
					System.out.println("Vector value must be an integer");
					cont = false;
					input.nextLine();
				}
			} while(!cont);
			}
		

		int runningSum = 0;
		for(int i = 0; i < vector1.length ; i++) {
			runningSum += (vector1[i] * vector2[i]);
			// Dot product equation
		}
		System.out.printf("The dot product is: "+runningSum);
	}
	
	
}
