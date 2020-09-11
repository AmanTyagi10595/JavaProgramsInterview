package Practice;

public class ReverseAnumber {

	public static void main(String[] args) {
		System.out.println("Strating");
		int num = 13531;
		int temp = num;
		int rev = 0;
        while(num>0) {
        	 int r = num % 10;
        	 rev = rev * 10 +r;
        	 num = num /10;
        	 System.out.println("While"+num);
        }
        if(rev == temp) {
        	System.out.println("Palindrome");
        }else{
        	System.out.println("Not a Palindrome");
        }
        System.out.println("Reverse: "+rev+" "+ temp);
	}

	
}
