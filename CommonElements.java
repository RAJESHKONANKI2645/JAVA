import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 4, 5, 6, 7};
        
        List<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println(commonElements); // Output: [2, 4]
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        List<Integer> common = new ArrayList<>();

        // Add elements of the first array to the set
        for (int num : array1) {
            set1.add(num);
        }

        // Check for common elements in the second array
        for (int num : array2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        return common;
    }
}
