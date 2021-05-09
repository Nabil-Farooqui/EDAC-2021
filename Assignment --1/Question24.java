import java.util.Scanner;
public class Question24 
{
      public static void main(String args[])
    {
        int x, y, z, i=1, j;
        int octal[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number: ");
        x = scan.nextInt();
		
        z = x;
		
        while(z != 0)
        {
            octal[i++] = z%8;
            z = z/8;
        }
		
        System.out.print("Octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octal[j]);
        }
		System.out.print("\n");
    }
}