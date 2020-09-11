package Practice;

import java.util.Arrays;
import java.util.Collections;

public class SecHighestInArray {

	public static void main(String[] args) {
		Integer[] array = {9,5,4,7,8,2,5,5};
		
//		 using method sort
		 Arrays.sort(array); 
		 System.out.println(Arrays.toString(array));
		System.out.println(array[array.length-2]);

	}

}
