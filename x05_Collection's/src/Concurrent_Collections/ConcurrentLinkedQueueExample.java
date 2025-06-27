package Concurrent_Collections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Adding elements
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Initial Queue: " + queue);

        // Removing elements
        System.out.println("Polled: " + queue.poll());  // Removes "A"

        // Checking head of the queue
        System.out.println("Head: " + queue.peek()); // "B"

        System.out.println("Final Queue: " + queue);
    }
}

// A thread-safe non-blocking queue using lock-free algorithm.
// Uses a FIFO (First-In-First-Out) order.

/* Output: 
Initial Queue: [A, B, C]
Polled: A
Head: B
Final Queue: [B, C]*/