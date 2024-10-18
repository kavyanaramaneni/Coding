import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // Create a PriorityQueue (Min-Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(2);

        // Print the elements in the min-heap
        System.out.println("Min-Heap:");
        while (!minHeap.isEmpty()) {
            // Polling removes the root element, which is the smallest
            System.out.print(minHeap.poll() + " ");
        }
    }
}
