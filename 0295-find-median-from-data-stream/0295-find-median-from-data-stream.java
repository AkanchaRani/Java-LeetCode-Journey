import java.util.*;

class MedianFinder {

    // Max Heap → smaller half
    PriorityQueue<Integer> maxHeap;

    // Min Heap → larger half
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // Add to max heap first
        maxHeap.add(num);

        // Move largest element of left half to right half
        if (!maxHeap.isEmpty() && !minHeap.isEmpty()
                && maxHeap.peek() > minHeap.peek()) {

            minHeap.add(maxHeap.poll());
        }

        // Balance the sizes
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        }
        else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {

        // Odd number of elements
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }

        // Even number of elements
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}