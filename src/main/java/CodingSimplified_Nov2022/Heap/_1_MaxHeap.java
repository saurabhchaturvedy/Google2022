package main.java.CodingSimplified_Nov2022.Heap;

import java.util.Arrays;

public class _1_MaxHeap {

    int heapSize;
    int[] heap;

    _1_MaxHeap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int item) {
        if (heapSize == heap.length - 1) {
            resize(2 * heapSize);
        }

        heap[heapSize] = item;
        swimUp(heapSize);
        heapSize++;
    }

    public int deleteMax() {
        int max = heap[0];
        heap[0] = heap[heap.length - 1];
        heapSize = heapSize - 1;
        heapify(0);
        return max;
    }

    private void heapify(int index) {

        int left = 2 * index + 1;
        int right = 2 * index + 2;

        int largest = index;

        while (left < this.heapSize && heap[left] > heap[largest]) {
            largest = left;
        }

        while (right < this.heapSize && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            heapify(largest);
        }

    }

    private void swimUp(int k) {

        while (k >= 1 && heap[(k - 1) / 2] < heap[k]) {
            int temp = heap[(k - 1) / 2];
            heap[(k - 1) / 2] = heap[k];
            heap[k] = temp;
            k = (k - 1) / 2;
        }
    }

    public int max() {
        return heap[0];
    }

    private void resize(int capacity) {

        heap = Arrays.copyOf(heap, 2 * capacity);
    }

    public static void main(String[] args) {
        _1_MaxHeap maxHeap = new _1_MaxHeap(4);
        maxHeap.insert(7);
        maxHeap.insert(19);
        maxHeap.insert(13);
        maxHeap.insert(29);
        maxHeap.insert(98);
        maxHeap.insert(2);

        System.out.println(maxHeap.max());

        maxHeap.deleteMax();

        System.out.println(maxHeap.max());

    }
}
