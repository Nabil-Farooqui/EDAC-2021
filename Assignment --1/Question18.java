class Question18
{
public static void main(String args[])
{
    int x = 1010;   
	int y=11;	
    int p = 0;
	int q=0;	

   
    int base1 = 1;
	int base2=1;
 
    int temp = x;
	int temp2=y;

    while (temp!=0) 
{
        int r= temp % 10;
        temp = temp / 10;
 
        p = p + temp2 * base1;

        base1 = base1 * 2;
  }
  while (temp2!=0) 
{
        int last_digit = temp2 % 10;
        temp2 = temp2 / 10;
 
        q = q + last_digit * base2;

        base2 = base2 * 2;
  }
	
	int decimal=p+q;
	int[] a=new int[10];
	int index=0;
	int r,s=1;
	while(q!=0)
	{
		r=decimal%2;
		a[index]=r;
		q=decimal/2;
		decimal=q;
		index++;
	}
	for(int i=0;i<index;i++)
	{
	System.out.print(a[i]);
	}
    
}
}