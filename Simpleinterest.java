import java.util.*;
class Simpleinterest
{
	public static void main(String arg[]){
		double p,t,r,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p value:");
		p=sc.nextDouble();
		System.out.println("enter t value:");
		t=sc.nextDouble();
		System.out.println("enter r value:");
		r=sc.nextDouble();
		a=(p*t*r)/100;
		System.out.println("simple interest:" +a);
	}
}