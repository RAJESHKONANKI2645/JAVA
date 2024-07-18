import java.util.*;
class Quotient{
	public static void main(String arg[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		a=sc.nextInt();
		System.out.println("enter b value:");
		b=sc.nextInt();
		if(b!=0){
			int quotient=a/b;
			int remainder=a%b;
			System.out.println("Quotient:" +quotient);
			System.out.println("Remainder:" +remainder);
		}else{
			System.out.println("Division error");
		}
	}
}