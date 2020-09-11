package Practice;

import java.util.Arrays;

public class ReplaceString {

	public static void main(String[] args) {
		String str = "ASDGDVVFSDSR";
		// With method
//		String st = str.replace("ASDG", "KG");
//        System.out.println(st);
		
		//WithOut method
		
		char[] arr = str.toCharArray();
		
		for(int y = 0; y<arr.length; y++) {
			for(int x = y+1; x<arr.length; y++) {
			      if(Arrays.copyOfRange(arr, y, x).toString().equals("SDS")){
			    	  System.out.println("Working");
			      }
			   }
	   }

}}
