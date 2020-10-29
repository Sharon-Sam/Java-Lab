//To display factors of given number

class factor{
	public static void main(String args[]){
		int n=28;
		System.out.println("Factors of " +n+ ":" );
		for(int i=1;i<=n;i++){
		    if(n%i==0){
			System.out.println(i+ " ");
			}
		    }
	}
}

/*OUTPUT
Factors of 28:
1
2
4
7
14
28*/