//Java Program to Remove All Whitespaces from a String

public class Practice12{
	public static void main(String [] args){
		String str = "This is the Best";
		
		String str1=str.replaceAll("\\s","");
		String str2=str.replaceAll(" ","");
		
		System.out.println(str1);
		
		System.out.println(str2);
	}
}