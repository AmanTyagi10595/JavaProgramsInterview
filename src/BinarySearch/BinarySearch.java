package BinarySearch;

public class BinarySearch {
	public static void main(String[] arg)
	{
		int[] ar= {3,4,5,6,7,8,9,10};
		int key=8;
		int first= 0;
		int last= ar.length;
		binarySrh(key, first, last, ar);
	}

	public static void binarySrh(int key, int first, int last,int[] ar)
	{
		int mid= (first + last)/2;
		while(first<= last)
		{
			if(ar[mid]== key)
		{
			System.out.println("The searched value is "+mid);
			break;
					
		}
			else if(ar[mid]<last)
			{
				first= mid;
			}
			else
			{
				last = mid;
			}
			mid= (first+last)/2;
		
	}
		 if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }
	}
}
