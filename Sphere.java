import java.util.*;
class Sphere
{
	public static void main(String arg[]){
		double r,pie,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter r value:");
		r=sc.nextDouble();
		pie=3.14;
		c=(4*pie*r*r*r)/3;
		System.out.println("Area:"+c);
	}
}