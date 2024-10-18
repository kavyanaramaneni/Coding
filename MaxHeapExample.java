import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        // Create a PriorityQueue (Max-Heap) using Collections.reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(2);

        // Print the elements in the max-heap
        System.out.println("Max-Heap:");
        while (!maxHeap.isEmpty()) {
            // Polling removes the root element, which is the largest
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
