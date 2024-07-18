import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquaresInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter lower range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upper = scanner.nextInt();

        
        if (lower > upper) {
            System.out.println("Invalid range: Lower range should be less than or equal to upper range.");
            return;
        }

        ArrayList<Integer> result = new ArrayList<>();

       
        for (int i = lower; i <= upper; i++) {
           
            if (isPerfectSquare(i)) {
               
                if (sumOfDigits(i) < 10) {
                    result.add(i);
                }
            }
        }

        
        System.out.println(result);
    }


    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

   
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
