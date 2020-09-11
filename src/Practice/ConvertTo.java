package Practice;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ConvertTo {
	
	// convert array to List
	static void convertArrayToList(Integer arr[]) {		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<>(Arrays.asList(arr));
		@SuppressWarnings("rawtypes")
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	// convert list to array
	static void listToArray(List<Integer> arl) {
		 System.out.println(arl.getClass().getName());
		 Object[] arr = new Integer[arl.size()]; 
	        arr =  arl.toArray();
		 System.out.println(arr);
		 for (Object x : arr) {
	            System.out.print(x + " "); 
	    } 
	}
	
	//convert array to set
	static void arrayToSet(Integer[] arr) {
		System.out.println(arr);
		Set mySet = new HashSet(Arrays.asList(arr));
		Iterator value = mySet.iterator();
		for (Object s : mySet) {
		    System.out.println(s);
		}
		/*while (value.hasNext()) { 
            System.out.println(value.next()); 
        } */
	}
	
	//convert set to array
	static void setToArray(Set<Integer> set) {
		 System.out.println(set.getClass().getName());
		 Object[] arr = new Integer[set.size()]; 
	        arr =  set.toArray();
		 System.out.println(arr);
		 for (Object x : arr) {
	            System.out.print(x + " "); 
	    } 
	}
	
	//convert list to set
	static void listToSet(List<Integer> list) {
		Set<Integer> set = new HashSet<Integer>(list);
		System.out.println(set);
	}
	
	//Iterate Map
	static void iterateMap(Map map) {
		System.out.println(map);
		Set set = map.entrySet();
		Set set2 = map.keySet();
		Collection cl = map.values();
		System.out.println(set2);
		System.out.println(cl + " : "+cl.getClass().getName());
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	// convert map to object
	static void mapToObject() {
		String str = "Raja";
		System.out.println(str);
	}
	public static void main(String[] args) {
		Integer[] array = {5,4,8,6,8};
		/*convertArrayToList(array);*/
		
//        List<Integer> ar = new ArrayList<Integer>();
//		ar.add(8);
//		ar.add(7);
//		ar.add(5);
//		ar.add(2);
//		listToArray(ar);
		
		/*arrayToSet(array);*/
		
		/*Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(8);
		mySet.add(7);
		mySet.add(5);
		mySet.add(2);
		setToArray(mySet);*/
		
//		listToSet(ar);
		
		HashMap map = new HashMap();
		map.put("Name", "Arjun");
		map.put("Age", 25);
		map.put("City", "Delhi");
		iterateMap(map);
	}
	

}
