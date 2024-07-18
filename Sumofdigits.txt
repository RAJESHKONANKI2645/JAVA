class Sumofdigits
{
	public static void main(String arg[])
	{
		int n,rev=0,rem,sum=0;
		n=1234;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		        sum=sum+rem;
		}
		System.out.println("sum of digits:"+sum);
	}
}