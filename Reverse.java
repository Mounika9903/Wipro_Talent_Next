package Wipro_Talent_Next;
// write a program to reverse a string or number add those number with given number
import java.util.Scanner;
public class Reverse {                      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Add the reversed number to the original number
        int sum = originalNumber + reversedNumber;

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Sum of Original and Reversed Number: " + sum);
        
        scanner.close();
    }
}

