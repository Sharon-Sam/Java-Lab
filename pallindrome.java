//To display a number is pallindrome or not

class pallindrome{
	public static void main(String args[]){
		int n=121;
		int remainder, reverse=0;
		int m=n;
		while(n!=0){
			remainder=n%10;
			reverse=reverse*10+remainder;
			n/=10;
		}
	
		if(m==reverse){
			System.out.println(m+ " is a pallindrome number");
		}
		else{
			System.out.println(m+ " is not a pallindrome number");
		}
	}
}

//OUTPUT
//121 is a pallindrome number