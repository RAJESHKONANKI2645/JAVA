import java.util.*;
class Rectangle
{
	public static void main(String arg[]){
		double l,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter l value:");
		l=sc.nextDouble();
		System.out.println("enter b value:");
		b=sc.nextDouble();
		c=l*b;
		System.out.println("Area:"+c);
	}
}