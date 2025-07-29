// write a program to count odd and even digits in a number
package Wipro_Talent_Next;
import java.util.Scanner;        
public class OddEvenCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int oddCount = 0;
        int evenCount = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            if (digit % 2 == 0) {
                evenCount++; // Increment even count
            } else {
                oddCount++; // Increment odd count
            }
            number /= 10; // Remove the last digit
        }

        System.out.println("Odd digits count: " + oddCount);
        System.out.println("Even digits count: " + evenCount);
        
        scanner.close();
    }
}
