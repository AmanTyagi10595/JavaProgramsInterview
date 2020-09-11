package Practice;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		
		int[] array = {7,7,0,0,8,8,5,4};
		int[] arrayChanged = new int[array.length];
		int j =0;
		int count = 0;
		for(int i =0; i<array.length-1; i++){
			
			if(array[i] != array[i+1]) {
				arrayChanged[j++] = array[i];
				count++;
			}	
		}
		arrayChanged[j] = array[array.length-1];
		int[] result = new int[count+1];
        for(int i =0; i<result.length; i++){
        	result[i] =arrayChanged[i];
		}
		for(int one :result) {	
			System.out.println("Hi"+one);
		}
	}
}
