import java.util.*;
class positive{
	public static void main(String arg[]){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		if(n>0){
			System.out.println("positive number");
		}
		if(n<0){
			System.out.println("negative number");
		}
		else{
			System.out.println("equal to zero");
		}
	}
}