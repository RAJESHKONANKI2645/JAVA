import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        
        double tax = calculateTax(income);
        System.out.println("Your tax is: " + tax);
        
        scanner.close();
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.10; // 10% tax on income above 2,50,000
        } else if (income <= 1000000) {
            tax = (250000 * 0.10) + (income - 500000) * 0.20; // 20% tax on income above 5,00,000
        } else {
            tax = (250000 * 0.10) + (500000 * 0.20) + (income - 1000000) * 0.30; // 30% tax on income above 10,00,000
        }

        return tax;
    }
}
