class Pyramid3
{
	public static void main(String args[])
	{
		int x,y,i,z=1;
		for(x=1;x<=6;x++)
		{
			for(y=5;y>=x;y--)
			{
				System.out.print(" ");
			}
			for(i=1;i<=z;i++)
			{
				System.out.print("*");
			}
			z+=2;
			System.out.println(" ");
			
		}
	}
}