package Innovation;
import java.util.*;

public class WorkingWithMap {
	public static void main(String args[]) {
	      
	      HashMap hm = new HashMap();	      
	      hm.put("Ayan", 33);
	      hm.put("Daisy", 22);
	      hm.put("Qadir", 42);

	      HashMap hmap = new HashMap();	      
	      hmap.put("Zara", 10);
	      hmap.put("Mahnaz", 11);
	      hmap.putAll(hm);
	      System.out.println(hmap + " "+"this is result");
	      Set s =hmap.entrySet();
	      System.out.println(s); 
	      
	      Iterator it = s.iterator();
	      while(it.hasNext()) {
	    	  Map.Entry data = (Map.Entry)it.next();
	    	  System.out.println("HI "+data.getKey()+ " :"+ data.getValue());
	    	  if(data.getKey().equals("Ayan")) {
	    		  data.setValue(100);
	    	  }
	      }
        System.out.println(hmap);
	}  
}
