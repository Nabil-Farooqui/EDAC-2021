import java.util.Scanner;
public class Question22
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  long x, y = 0, j = 1, remainder;
  System.out.print("Enter a binary number: ");
  x = sc.nextLong();

  while (x != 0) 
  {
   remainder = x % 10;
   y = y + remainder * j;
   j = j * 2;
   x = x / 10;
  }
  System.out.println("Decimal Number: " + y);
 }
}