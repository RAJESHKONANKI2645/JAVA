import java.util.*;
class days
{
    public static void main(String args[])
    {
        int n,year,remdays,week,days;
        Scanner S = new Scanner(System.in);
        System.out.println("enter the number of days");
        n=S.nextInt();
        year=n/365;
        remdays=n%365;
        week=remdays/7;
        days=remdays%7;
        System.out.println("the total number of years"+ year);
        System.out.println("the total number of remdays"+ remdays);
        System.out.println("the total number of week"+ week);
        System.out.println("the total number of days"+ days);
    }
}
