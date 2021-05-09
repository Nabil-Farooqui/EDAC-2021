import java.util.Scanner;
public class Question17 
{

	public static void main(String[] args) 
{
		
		int number1,number2;
		int digit1,digit2,sum=0,carry=0;
		int[]arr= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Binary");
		number1=sc.nextInt();
		System.out.println("Enter 2nd Binary");
		number2=sc.nextInt();
		
		digit1 = number1%10; 
		digit2 = number2%10;
		sum = digit1 + digit2 + carry;
		
}
}