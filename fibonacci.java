//To display fibonacci series

class fibonacci{
	public static void main(String args[]){
		int n=10;
		int a=0,b=1,sum;
		System.out.println("Sum of first " +n+ " terms:");
		for(int i=1;i<=n;i++){
		    System.out.println(a+"+");
		    sum=a+b;
		    a=b;
		    b=sum;
		}
	}
}

/*OUTPUT
Sum of first 10 terms:
0+
1+
2+
3+
5+
8+
13+
21+
34+  */