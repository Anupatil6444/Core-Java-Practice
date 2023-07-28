//Java Program to Find the Frequency of Character in a String 

public class Practice11{
	public static void main(String [] args){
		String str="This website is for anyone use";
		char ch='s';
		int frequency =0;
		
		for(int i=0 ; i<str.length();i++)
		{
			//We loop through each character in the string using charAt() function which 
			//takes the index (i) and returns the character in the given index.
			if(ch==str.charAt(i)){
				frequency++;
			}
		}
		System.out.println("Frequency of Character : "+frequency);
	}
}