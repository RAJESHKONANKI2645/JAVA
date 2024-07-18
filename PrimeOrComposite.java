import java.util.*;
class PrimeOrComposite
{
	public static void main(String arg[]){
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		n=sc.nextInt();
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				count=1;
				break;
			}
		}
		if(count==0){
			System.out.println("Prime number");
		}
		else{
			System.out.println("composite number");
		}
	}
}