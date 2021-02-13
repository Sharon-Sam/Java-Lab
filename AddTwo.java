//to display sum of 2 numbers

import java.util.Scanner;
class AddTwo{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n =obj.nextInt();
		System.out.println("Enter the second number:");
		int m= obj.nextInt();
		System.out.println("Sum="+(n+m));
	}
}

/*OUTPUT
Enter the first number:
3
Enter the second number:
5
sum=8 */
