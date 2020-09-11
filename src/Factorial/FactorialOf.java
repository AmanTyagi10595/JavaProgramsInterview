package Factorial;

import java.util.Scanner;

public class FactorialOf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int x= scanner.nextInt();
		System.out.println(factorial(x));
		scanner.close();
	}
	
	public static int factorial(int x) {
	int out;
		if(x>0)
		{
		 out = x * factorial(x-1);
		 return out;
		}
		
		else {
		return 1;
		}
		
	}
	

}
