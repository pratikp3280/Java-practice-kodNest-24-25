package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Adding_New_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the number of elements (n)
        System.out.println("Enter the Size of an ArrayList:");
        int n = sc.nextInt();

        // TODO: Create an ArrayList to store integers
        ArrayList list = new ArrayList();

        // TODO: Add elements to the ArrayList using add() method
        System.out.println("Enter the Elements of an ArrayList:");
        for(int i = 0 ; i < n ; i++){
             
            list.add(sc.nextInt());
        }

        System.out.println("Enter the index for Insertion:");
        int idx = sc.nextInt();
        System.out.println("Enter the Element to add at index " + idx + ": ");
        int ele = sc.nextInt();

        list.set(idx,ele);

        // TODO: Print the updated ArrayList
        System.out.println("Updated ArrayList:");
        for(int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
        sc.close();
    }
}