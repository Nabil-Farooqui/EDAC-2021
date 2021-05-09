class Pyramid4
{
	public static void main(String args[])
	{
		int i,j,k,x=5;
		for(i=1;i<=6;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=x;k>=5;k--)
			{
				System.out.print(k);
				
			}
			x=x+2;
			System.out.println(" ");
			
		}
	}
}