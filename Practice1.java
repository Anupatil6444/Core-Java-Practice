//Java Program to Print an Integer (Entered by the User)

import java.util.Scanner;
public class Practice1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		//nextInt() is used for reads the next integer from the keyboard
		int number = sc.nextInt();
		
		System.out.println("The Given no. is : "+number);
	}
}