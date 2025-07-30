// import java.util.LinkedList;
// import java.util.Collections;
// public class Merged_linked_list 
// {

//     public static void main(String[] args) {
//         // Create two linked lists
//         LinkedList<Integer> list1 = new LinkedList<>();
//         LinkedList<Integer> list2 = new LinkedList<>();

//         // Add elements to the first linked list
//         list1.add(1);
//         list1.add(3);
//         list1.add(5);

//         // Add elements to the second linked list
//         list2.add(2);
//         list2.add(4);
//         list2.add(6);

//         // Merge the two linked lists
//         LinkedList<Integer> mergedList = new LinkedList<>();
//         mergedList.addAll(list1);
//         mergedList.addAll(list2);

//         // Sort the merged linked list
//         Collections.sort(mergedList);

//         // Print the sorted merged linked list
//         System.out.println("Sorted Merged Linked List: " + mergedList);
//     }
// }
// write a  program to merge two linked lists and sort it giving user input
import java.util.LinkedList;
import java.util.Collections;   
import java.util.Scanner;
public class Merged_linked_list {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create two linked lists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Input for the first linked list
        System.out.print("Enter the number of elements in the first linked list: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter elements for the first linked list:");
        for (int i = 0; i < size1; i++) {
            list1.add(scanner.nextInt());
        }

        // Input for the second linked list
        System.out.print("Enter the number of elements in the second linked list: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter elements for the second linked list:");
        for (int i = 0; i < size2; i++) {
            list2.add(scanner.nextInt());
        }

        // Merge the two linked lists
        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Sort the merged linked list
        Collections.sort(mergedList);

        // Print the sorted merged linked list
        System.out.println("Sorted Merged Linked List: " + mergedList);
        
        scanner.close();
    }
}
