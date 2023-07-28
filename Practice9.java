//Java Program to Find the Largest Among Three Numbers

public class Practice9 {

    public static void main(String[] args) {

        double n1 = 8, n2 = 2, n3 = 1;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}