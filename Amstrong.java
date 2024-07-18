class Armstrong
{
	public static void main(String arg[])
	{
		int n,rev=0,rem=0,sum=0,m;
		n=153;
		m=n;
		while(n!=0)
		{
			rem=n%10;
		        sum+=(rem*rem*rem);
			n=n/10;
		}
		if(sum==m)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}
		