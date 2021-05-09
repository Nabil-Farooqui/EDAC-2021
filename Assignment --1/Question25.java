import java.util.Scanner;

public class Question25 
{
 
public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in);
     long x, y = 0;
     int i = 0;
     System.out.print("Input any octal number: ");
    x = in.nextLong();
    while (x != 0) 
     {
      y = (long)(y + (x % 10) * Math.pow(8, i++));
      x = x / 10;
     }
    System.out.print("Equivalent decimal number: " +y);
   }
}
