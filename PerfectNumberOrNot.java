class PerfectNumberOrNot
{
	public static void main(String arg[])
	{
		int n,i,sum=0;
		n=6;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			 	System.out.println(sum);
			}
			if(sum==n)
			{
				System.out.println("perfect number");
			}
			else
			{
				System.out.println("not perfect number");
			}
		}
	}
}