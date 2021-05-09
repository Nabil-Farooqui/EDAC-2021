import java.util.Scanner;

public class Question23 
{
    public static void convertBinaryToDecimalString() 
	{
        Scanner myscnr = new Scanner(System.in);

        int decimal = 0;

        String binary;
        System.out.println ("Please enter a binary number: ");
        binary = myscnr.nextLine();
        decimal = Integer.parseInt (binary, 2);
        System.out.println ("The decimal number that corresponds to " + binary + " is " + decimal);
    }

    public static void main (String[] args) {
        convertBinaryToDecimalString();
    }
}