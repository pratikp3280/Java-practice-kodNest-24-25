package x1_Problems;

import java.util.*;

public class Find_Kth_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the Array Size:");
        int n = sc.nextInt();

        // Input array elements
        System.out.println("Enter the Array Elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input value of k
        System.out.println("Enter the k Value:");
        int k = sc.nextInt();

        // Find and print the k largest elements
        int kthLargest = findKthLargest(arr, k);
        System.out.println("Input: arr = " + Arrays.toString(arr) + ", k = " + k);
        System.out.println("Output: " + kthLargest);

        sc.close();
    }

    public static int findKthLargest(int[] arr, int k) {
        // Using a Min Heap (PriorityQueue) of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest element to keep only k largest
            }
        }

        // The top of the heap is the Kth largest element
        return minHeap.peek();
    }
}
