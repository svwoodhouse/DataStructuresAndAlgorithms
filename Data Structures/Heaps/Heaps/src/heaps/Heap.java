package heaps;

public class Heap {
    private int[] heap;
    private int size;
    
    public Heap(int capacity){
        heap = new int[capacity];
    }
    
    public boolean isFull() {
        return size == heap.length;
    }
    
    public int getParent(int index){
        return (index-1)/2;
    }
    
    public void insert(int value) {
        if(isFull())
            throw new IndexOutOfBoundsException("Heap is full");
        
        // Puts the item at the next available spot
        heap[size] = value;
        
        //Heapify: checks to see if value is greater than its parent
        fixHeapAbove(size);
        
        // Used to track the next available space in the array
        size++;
        
      
        
    }
    
    private void fixHeapAbove(int index){
        int newValue = heap[index];
        while(index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
        
    }
    
    
}
