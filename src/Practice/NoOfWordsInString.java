package Practice;

import java.util.HashMap;

public class NoOfWordsInString {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		String str = "this city is very beautiful and this is awesome";
		String[] array = str.split(" ");
		for(String one: array) {
			System.out.println(one);
		}
		HashMap map = new HashMap();
		for(int x =0; x<array.length; x++) {
			if(map.containsKey(array[x])) {
				int count = (int) map.get(array[x]);
				map.put(array[x], (int)map.get(array[x])+1);
			}else {
				map.put(array[x], 1);
			}
		}
		System.out.println("Result : "+ map);
	}

}
