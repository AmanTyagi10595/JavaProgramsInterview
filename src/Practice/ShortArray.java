package Practice;

import java.util.Arrays;

public class ShortArray {

	public static void main(String[] args) {
	    
        int[] array = {4,10,9,7,3,2,1};
        //Simply by method
//        Arrays.sort(array);
//        for(int one: array){
//	     System.out.println(one);
//	}
        
        // Spliting array
//        int[] tempArray = new int[(int) Math.ceil(array.length/2)];
//
//        	tempArray = Arrays.copyOfRange(array, 0, (int) Math.round(array.length/2));
//        	 Arrays.sort(tempArray);
//        	for(int one: tempArray){
//    	     System.out.println(one);
//    	    
//              }
        
        //Sort array without method
        for(int x =0; x< array.length; x++) {
        	int temp = 0;
        	for(int y =x+1; y< array.length; y++) {
            	if(array[x] > array[y]) {
            		temp = array[x];
            		array[x] = array[y];
            		array[y] = temp;
            	}
            }
        }
        System.out.println("Shorted array: ");
        for(int one: array){
   	     System.out.print(one+",");
   	    
        }
	}
}






