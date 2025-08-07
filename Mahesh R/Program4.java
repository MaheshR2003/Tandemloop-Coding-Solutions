import java.util.*;

public class MultiplesCount {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to store counts for 1 to 9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize counts for 1 to 9
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count how many numbers are divisible by each i (1 to 9)
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            countMap.put(i, count);
        }

        // Print the result
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
