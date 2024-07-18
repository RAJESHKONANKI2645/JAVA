import java.util.*;
class days1
{
	public static void main(String arg[])
	{
		int n,year,remdays,week,days;
		Scanner S=new Scanner(System.in);
		System.out.println("enter number of days");
		n=S.nextInt();
		year=n/365;
		remdays=n%365;
		week=remdays/7;
		days=remdays%7;
		System.out.println("total number of year"+year);
		System.out.println("total number of remdays"+remdays);
		System.out.println("total number of week"+week);
		System.out.println("total number of days"+days);
}
}
		