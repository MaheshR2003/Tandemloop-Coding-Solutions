import java.util.Scanner;

public class OddSeriesConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Condition if n is even 
        if (n % 2 == 0) {
            n = n - 1; // Use the previous odd number
        }

        int count = 0;
        int num = 1;

        System.out.print("Output: ");
        while (count < n) {
            if (num % 2 != 0) { // Check for odd
                System.out.print(num);
                count++;
                if (count < n) {
                    System.out.print(", ");
                }
            }
            num++; // Next number
        }

        sc.close();
    }
}
