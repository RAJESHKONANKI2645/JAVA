import java.util.*;
class leapyear
{
	public static void main(String arg[]){
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year:");
		year=sc.nextInt();
		if(year%4==0){
			System.out.println("leap year");
		}else{
			System.out.println("not leap year");
		}
	}
}