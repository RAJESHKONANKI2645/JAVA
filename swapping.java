import java.util.*;
class swapping
{
	public static void main(String arg[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		a=sc.nextInt();
		System.out.println("enter b value:");
		b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
	}
}