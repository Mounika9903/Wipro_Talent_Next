// write a program if input is 1234 and output is 2 it should run for all given number should print second number
import java.util.Scanner;
public class SecondDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Convert the number to a string to access the second digit
        String numberStr = Integer.toString(number);
        
        if (numberStr.length() < 2) {
            System.out.println("The number does not have a second digit.");
        } else {
            char secondDigitChar = numberStr.charAt(1); // Get the second character
            System.out.println("The second digit is: " + secondDigitChar);
        }
        
        scanner.close();
    }
}
