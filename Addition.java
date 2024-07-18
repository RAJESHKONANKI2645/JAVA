import java.util.*;
class Addition
{
	public static void main(String arg[]){
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		a=sc.nextDouble();
		System.out.println("enter b value:");
		b=sc.nextDouble();
		c=a+b;
		System.out.println("Add:"+c);
	}
}