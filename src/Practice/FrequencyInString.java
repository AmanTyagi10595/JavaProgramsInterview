package Practice;

public class FrequencyInString {

	public static void main(String[] args) {
		String str = "TTyyfdsssdkk";
		char temp[]  = str.toCharArray();
		System.out.println(temp);
		int data[] = new int[str.length()];
		
		for(int x =0; x<str.length(); x++) {
			int count = 1;
			for(int y = x+1; y<str.length(); y++) {
				if(temp[x] == temp[y]){
					count += 1;
					temp[y]=0;
				}
			}
			data[x] = count;
//			System.out.println(temp[x]+" - "+count);
		}
		for(int x =0; x<temp.length; x++) {
			if(temp[x] != ' ' && temp[x] != 0) {
				System.out.println(temp[x]+ " - "+ data[x]);
			}
			
		}
	}

}
