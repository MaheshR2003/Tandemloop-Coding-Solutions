import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of odd numbers to print
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int count = 0; // To keep track of how many odd numbers we've printed
        int num = 1;   // Start from 1

        System.out.print("Output: ");
        while (count < n) {
            if (num % 2 != 0) { // Check if the number is odd
                System.out.print(num);
                count++;
                if (count < n) {
                    System.out.print(", ");
                }
            }
            num++; // Check next number
        }

    }
}
