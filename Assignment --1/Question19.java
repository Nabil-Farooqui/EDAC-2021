import java.util.Scanner;
public class Question19
{
	public static void main(String args[])
	{
		int x,quot,i=1,j;
		int y[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a Decimal Number :");
		x=sc.nextInt();
		quot=x;
		while(quot!=0)
		{
			y[i++]=quot%2;
			quot=quot/2;
		}
		System.out.print("Binary number is :");
		for(j=i-1;j>0;j--)
		{
			System.out.println(y[j]);
		}
		System.out.println("\n");
	}
}