import java.util.*;
class Fahrenhit
{
	public static void main(String arg[]){
		double celsius,fahrenhit;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter celsius value:");
		celsius=sc.nextDouble();
		fahrenhit=1.8*celsius+32;
		System.out.println("fahrenhit to celsius:"+fahrenhit);
	}
}