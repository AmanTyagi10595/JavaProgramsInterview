package StarPattern;

public class Starpatter3 {

	public static void main(String[] args) {
		print(6);

	}
    public static void print(int n)
    {
    	for(int i=1; i<=n; i++)
    	{
    		for(int j=i; j<=(n-1); j++) {
    			System.out.print(" ");
    		}
    		
    		for(int j=0; j<i; j++) {
    			System.out.print(" 	*");
    		}
    		
    		System.out.println();
    	}
    }
}