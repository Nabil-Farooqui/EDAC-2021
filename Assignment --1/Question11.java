import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) 
	{
		Scanner circle = new Scanner(System.in);
		  System.out.println ("Input the radius of the circle: ");
		  double radius = circle.nextDouble();
		  System.out.println ("Perimeter is = " + (2 * radius * 3.14));
		  System.out.println ("Area is = " + (3.14 * radius * radius));

	}

}