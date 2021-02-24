//To display prime number or not

class primenum{
	public static void main(String args[]){
		int n=7;
		int count=0;
		if(n==0 || n==1){
			System.out.println("Not a prime number");
 		}
		for(int i=2;i<=n/2;i++){	
			if(n%i==0){
				count ++;
			}
		}
		if(count==1){
			System.out.println(n+ " is not a prime number");
			}
		else{
			System.out.println(n+ " is a prime number");
		}
	}
}

/*OUTPUT
7 is a prime numer */
