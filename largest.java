import java.util.*;
class largest{
	public static void main(String arg[]){
		int n1,n2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number1:");
		n1=sc.nextInt();
		System.out.println("Enter number2:");
		n2=sc.nextInt();
		if(n1>n2){
			System.out.println("number 1 is largest");
		}else{
			System.out.println("number 2 is largest");
		}
	}
}