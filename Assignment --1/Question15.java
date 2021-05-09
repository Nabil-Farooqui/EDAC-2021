import java.util.Scanner;
public class Question15 {

	public static void main(String[] args)
	{
		Scanner Swap = new Scanner(System.in);
		int a,b,temp;
		
		System.out.println("Enter 1st number");
		int x = Swap.nextInt();
		
		System.out.println("Enter 2nd number");
		int y = Swap.nextInt();
		
		System.out.println("Before swapping : x, y = "+x+", "+ + y);

		temp = x;
		   x = y;
		   y = temp;   
		  System.out.println("After swapping : x, y = "+x+", "+ + y);
	}

}