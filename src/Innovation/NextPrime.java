package Innovation;

public class NextPrime {

	public static void main(String[] args) {
		
		NextPrime nx = new NextPrime();
		nx.nextPrime(7);
	}
	public int  nextPrime(int input){
		  int counter;
		  input++;   
		  while(true){
		    counter = 0;
		    for(int i = 2; i < input; i ++){
		      if(input % i == 0)  counter++;
		    }
		    if(counter == 0)
		      return input;
		    else{
		      input++;
		      continue;
		    }
		  }
		}

}
