//Java Program to Swap Two Numbers

public class Practice6 {

    public static void main(String[] args) {

  //With Using temporary variable
  
        float first = 1.20f, second = 2.45f;
		System.out.println("With Using temporary variable");
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
		float temporary = first;
        first = second;
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
		
		
		//Without Using temporary variable
		System.out.println("\n*******************************************\n\nWithout Using temporary variable");
	      first = 12.0f; second = 24.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}