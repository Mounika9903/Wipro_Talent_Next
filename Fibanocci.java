// write a program of fibanoccii without recursion
import java.util.Scanner;                  
public class Fibanocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;
        
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second; // Calculate the next term
            first = second; // Update first to the second term
            second = next; // Update second to the next term
        }
        
        scanner.close();
    }
}