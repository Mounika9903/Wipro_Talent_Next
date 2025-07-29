// Write a program taking two array and merge and sort it
import java.util.Arrays;
import java.util.Scanner;   

public class Merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        // Merging arrays
        int[] mergedArray = new int[size1 + size2];
        System.arraycopy(array1, 0, mergedArray, 0, size1);
        System.arraycopy(array2, 0, mergedArray, size1, size2);
        
        // Sorting the merged array
        Arrays.sort(mergedArray);
        
        // Displaying the sorted merged array
        System.out.println("Sorted merged array: " + Arrays.toString(mergedArray));
        
        scanner.close();
    }
}
