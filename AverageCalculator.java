import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        double positiveSum = 0;
        double negativeSum = 0;

        System.out.println("Enter -1 to exit…");
        
        while (true) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();

            if (number == -1) {
                break; // Exit if -1 is encountered
            }

            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            }
        }

        // Calculate and display the average of positive numbers
        if (positiveCount > 0) {
            double positiveAverage = positiveSum / positiveCount;
            System.out.println("The average of positive numbers is: " + positiveAverage);
        } else {
            System.out.println("No positive numbers entered.");
        }

        // Calculate and display the average of negative numbers
        if (negativeCount > 0) {
            double negativeAverage = negativeSum / negativeCount;
            System.out.println("The average of negative numbers is: " + negativeAverage);
        } else {
            System.out.println("No negative numbers entered.");
        }

        scanner.close();
    }
}

