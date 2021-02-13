//to display whether a number is even or odd

import java.util.Scanner;
class OddEven{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int n=obj.nextInt();
		if(n%2==0)
		{
		   System.out.println(n+" is even");
		}
		else
		{
		   System.out.println(n+ " is odd");
		}
	}
}

/*OUTPUT
Enter a number to check:
12
12 is even */
