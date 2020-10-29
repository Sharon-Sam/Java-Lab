//To display factorial of first n numbers

class factorial{
	public static void main(String args[]){
		int n=7;
		int fact=1;
		for(int i=1;i<=n;i++){
			
				fact*=i;
				System.out.println("Factorial of " +i+ ":" +fact);
		}
	}
}


/*OUTPUT
Factorail of 1:1
Factorial of 2:2
Factorial of 3:6
Factorial of 4:24
Factorial of 5:120
Factorial of 6:720
Factorial of 7:5040*/