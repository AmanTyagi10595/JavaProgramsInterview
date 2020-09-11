package EvenOdd;

import java.util.Scanner;

public class EvenOddClass {

	public static void main(String[] args) {
		int j=0;
		Scanner Scan =new Scanner(System.in);
		System.out.println("Enter the no you want to check");
		j= Scan.nextInt();
		if((j&1) == 0)
		{
			System.out.println("thisis a even no.");
		}
		else
		{
			System.out.println("thisis a odd no.");
		}
		
	}

}
