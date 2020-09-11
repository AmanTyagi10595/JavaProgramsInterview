package Innovation;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
Scanner s= new Scanner(System.in);
System.out.println("Enter the first no");
int x = s.nextInt();
System.out.println("Enter the first no");
int y = s.nextInt();

System.out.println("List of prime numbers between " + x + " and " + y);  
for (int i = x; i <= y; i++) {  
    if (isPrime(i)) {  
        System.out.println(i);  
    }  
}  

	}
public static boolean isPrime(int z){
	if(z<=1) {
		return false;
	}
	for(int k=2; k<z; k++) {
		if(z%k==0) {
			return false;
			
		}
	}
	return true;
	
}
}
