class Pyramid1
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=4;j>i;j--)
			{
				if(j>i)
				{
				System.out.print(" ");}
				else
				{
					System.out.print(" "+i);
				}
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		
	}
}