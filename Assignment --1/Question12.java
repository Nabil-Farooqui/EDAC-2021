import java.util.Scanner;
public class Question12
{

	public static void main(String[] args) {
		Scanner Average = new Scanner(System.in);
		   
		  System.out.println("Input 1st number:  ");
		  int num1 = Average.nextInt();
		  
		  System.out.println("Input 2nd number:  ");
		  int num2 = Average.nextInt();
		   
		  System.out.println("Input 3rd number:  ");
		  int num3 = Average.nextInt();
		   		 	   
		  System.out.println("Average of numbers: " + (num1 + num2 + num3 ) /3);
	}

}