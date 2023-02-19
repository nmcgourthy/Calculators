package calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Permutation_combination {

	public static void main(String[] args) {
		String choice = returnChoice();
		if(choice.equals("permutation")) {
			permutations();
		} else {
			combinations();
		}
	}
	public static String returnChoice() {
		boolean Cont = true;
		// used to tell if input is either p or c
		String choice = "";
		// user response to permutation or combination
		
		Scanner input = new Scanner(System.in);
		System.out.println("Permutations or combinations calculation (p or c)");
		do{try {
			choice = input.nextLine();
			choice.toLowerCase();
			if(choice.equals("p") || choice.equals("c")) {
				Cont = true;
			} else {
				Cont = false;
				System.out.println("Please input p or c");
			}
		} catch(InputMismatchException e) {
			System.out.println("Please input p or c");
		}} while(!Cont);
		
		if(choice.equals("p")) {
			return "permutation";
		} else {
			return "combination";
		}
		
		
	}
	public static void permutations() {
		int n = 0;
		int r = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("nPr where n = # of elements and r = # of items in the subsets created");
		boolean cont = true;
		
		do {
		try {
			System.out.println("n:");
			n = input.nextInt();
			System.out.println("r:");
			r = input.nextInt();
			if(r > n) {
				cont = false;
				System.out.println("r cannot be > n, please retry");
			}else {
				cont = true;
			}
		} catch(InputMismatchException e) {
			System.out.println("Please enter an integer");
			cont = false;
		}}
		while(!cont);
		
		int numerator = n;
		int denominator = n-r;
		
		for(int i = n-1 ; i > 0 ; i--) {
			numerator *= i;
		}
		for(int i = (n-r)-1 ; i > 0 ; i--) {
			denominator *= i;
		}
		
		System.out.println(numerator/denominator + " permutations");
	}
	public static void combinations() {
		int n = 0;
		int r = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("nPr where n = # of elements and r = # of items in the subsets created");
		boolean cont = true;
		
		do {
		try {
			System.out.println("n:");
			n = input.nextInt();
			System.out.println("r:");
			r = input.nextInt();
			if(r > n) {
				cont = false;
				System.out.println("r cannot be > n, please retry");
			}else {
				cont = true;
			}
		} catch(InputMismatchException e) {
			System.out.println("Please enter an integer");
			cont = false;
		}}
		while(!cont);
		
		int numerator = n;
		int denominatorPartOne = r;
		int denominatorPartTwo = n-r;
		
		for(int i = n-1 ; i > 0 ; i--) {
			numerator *= i;
		}
		for(int i = r-1 ; i > 0 ; i--) {
			denominatorPartOne *= i;
		}
		for(int i = (n-r)-1 ; i > 0; i--) {
			denominatorPartTwo *= i;
		}
		System.out.println(numerator/(denominatorPartOne*=denominatorPartTwo) + " combinations");
	}
}
