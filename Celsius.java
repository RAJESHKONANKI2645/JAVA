import java.util.*;
class Celsius
{
	public static void main(String arg[]){
		double celsius,fahrenhit;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fahrenhit value:");
		fahrenhit=sc.nextDouble();
		celsius = (fahrenhit - 32) / 1.8;
		System.out.println("celsius to fahrenhit:"+celsius);
	}
}