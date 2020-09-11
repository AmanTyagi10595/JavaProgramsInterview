package StarPattern;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the limit of Pascal triangle");
		int n= Sc.nextInt();
		Sc.close();
		
		for(int i=0; i<n; i++) {
			
			for(int k=(n-1); k>i; k--) {
				System.out.print(" ");
			}
			int number=1;
			for(int j=0; j<=i; j++) {
				System.out.print(number+" ");
				number= number*(i-j)/(j+1);
			}
			System.out.println();
		}

	}

}
