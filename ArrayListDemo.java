import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ArrayListDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Create an ArrayList to hold String elements
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Enter an integer for list1: (5 integers)");
        for(int i = 0; i < 5; i++) {
            
            int input1 = s.nextInt();
            list1.add(input1);
        }
        
        System.out.println("Enter an integer for list2:(3 integers)");
        for(int i = 0; i < 3; i++) {
            
            int input1 = s.nextInt();
            list2.add(input1);
        }
        

        int size1 = list1.size();
        int size2 = list2.size();

        ArrayList<Integer> mergedList = new ArrayList<>(size1 + size2);
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        System.out.println("Merged List: " + mergedList);
        
        mergedList.sort(null);
        System.out.println("Sorted Merged List: " + mergedList);
    }
}
