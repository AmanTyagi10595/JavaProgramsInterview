package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumberInList {

	public static void main(String[] args) {
		ArrayList arl = new ArrayList();
		arl.add(9);
		arl.add(8);
		arl.add(7);
		System.out.println(arl);
		//By converting to array
		Iterator itr = arl.iterator();
		while(itr.hasNext()) {
			int count =0;
			int num = (int) itr.next();
			 if(num==0||num==1){  
				       
				  }
			 else{
				for(int y = 2; y<num; y++) {
				    if(num % y == 0) {
				    	count = 1;
				    }
				} 
			 }
			 if(count == 0) {
				 System.out.println(num);
			 }
		}
	}

}
