// write a factorial program without recursion
import java.util.Scanner;
public class Factorial {                
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        
        long factorial = 1; // Use long to handle larger results
        
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply current value of factorial by i
        }
        
        System.out.println("Factorial of " + n + " is: " + factorial);
        
        scanner.close();
    }
}
