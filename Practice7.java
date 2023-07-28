//Java Program to Check Whether a Number is Even or Odd

import java.util.Scanner;

public class Practice7{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

       //Check whether a number is even or odd using if...else statement
	   
        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
			
		//Check whether a number is even or odd using ternary operator
		
		String evenOdd = (num % 2 == 0) ? "even" : "odd";
		System.out.println(num + " is " + evenOdd);
    }
}