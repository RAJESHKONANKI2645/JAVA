import java.util.*;
public class UniquePermutations {
    
    public static Set<String> generateUniquePermutations(String numberStr) {
        Set<String> uniquePerms = new HashSet<>();
        
        char[] digits = numberStr.toCharArray();      
        generatePermutations(digits, 0, uniquePerms);
        return uniquePerms;
    }
    
    private static void generatePermutations(char[] digits, int index, Set<String> uniquePerms) {
        if (index == digits.length - 1) {
            
            String perm = new String(digits);
            uniquePerms.add(perm);
        } else {
            for (int i = index; i < digits.length; i++) {
               
                swap(digits, index, i);
              
                generatePermutations(digits, index + 1, uniquePerms);
             
                swap(digits, index, i);
            }
        }
    }
    

    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
    

    public static void printUniquePermutations(int number) {
        // Convert number to string and handle negative sign
        String numberStr = Integer.toString(number);
        if (numberStr.charAt(0) == '-') {
            numberStr = numberStr.substring(1);
        }
        
       
        Set<String> uniquePerms = generateUniquePermutations(numberStr);
      
        System.out.println("Permutations are:");
        for (String perm : uniquePerms) {
            if (number < 0) {
                System.out.println("-" + perm);
            } else {
                System.out.println(perm);
            }
        }
    }
    

    public static void main(String[] args) {
        
        int[] testCases = {0, 111, 505, -143, -598};
        
        for (int num : testCases) {
            System.out.println("Given Number: " + num);
            printUniquePermutations(num);
            System.out.println();
        }
    }
}
