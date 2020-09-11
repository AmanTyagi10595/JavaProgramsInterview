package Practice;

public class RecerseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "REVERSEME";
        String temp = "";
        System.out.println(str);
        //(1) by split string to array
/*        String [] data = str.split("");
        for(int i=data.length -1 ; i>=0; i--) {
 		   System.out.print(data[i]); 
 		   temp += data[i];
 	   }
        System.out.println(); 
      System.out.println(temp);*/
        
        //(2) changing string to charArray
        char[] ch = str.toCharArray();
        for(int i=ch.length -1 ; i>=0; i--) {
        	temp += ch[i];
        }
        System.out.println(temp);
	}

}
