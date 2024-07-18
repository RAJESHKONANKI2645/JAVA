import java.util.*;

class ReverseAndAdd {
    // Method to reverse a number
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();
        int sum = number;
        
        while (!isPalindrome(sum)) {
            int reversedNumber = reverse(sum);
            sum = sum + reversedNumber;
        }

        System.out.println("Palindrome number: " + sum);
    }
}