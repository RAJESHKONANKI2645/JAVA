import java.util.*;
class Triangle
{
	public static void main(String arg[]){
		double l,b,h,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter l value:");
		l=sc.nextDouble();
		System.out.println("enter b value:");
		b=sc.nextDouble();
		System.out.println("enter h value:");
		h=sc.nextDouble();
		c=l*b*h;
		System.out.println("Area:"+c);
	}
}