import java.util.*;

public class NumberSquareArray {
    
   
    public static List<int[]> createNumberSquareArray(int lowerRange, int upperRange) {
        List<int[]> result = new ArrayList<>();
       
        if (lowerRange > upperRange) {
           
            int temp = lowerRange;
            lowerRange = upperRange;
            upperRange = temp;
        }
        
     
        for (int i = lowerRange; i <= upperRange; i++) {
            int[] pair = new int[2];
            pair[0] = i;            
            pair[1] = i * i;        
            result.add(pair);
        }
        
        return result;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();
        
      
        List<int[]> result = createNumberSquareArray(lowerRange, upperRange);
        

        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            int[] pair = result.get(i);
            System.out.print("(" + pair[0] + ", " + pair[1] + ")");
            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
}
