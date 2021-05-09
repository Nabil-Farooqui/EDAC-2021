import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) 
	
{
	Scanner scan1 = new Scanner(System.in);
			
	System.out.print("Input a number: ");
		  int a = scan1.nextInt();
		   
		  for (int i=0; i < 10; i++)
		  
	{
		  System.out.println(a + " x " + (i+1) + " = " + (a * (i+1)));

	}

}
	
}