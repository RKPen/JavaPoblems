import java.util.*;

public class HeapIntPriorityQueue {
    private int[] elementData;
    private int size;
    

    //Contructor
    public HeapIntPriorityQueue() {
        elementData = new int[5];
        size = 0;
        
    }

    //Methods
    public void add(int value) {
        if (size >= elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }
        elementData[size] = value;
        size++;
        bubbleUp();
    }
    public void bubbleUp() {
        int index = size - 1;
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (elementData[index] < elementData[parent]) {
                int temp=index;
                index=parent;
                parent=temp;
            } else {
                break;
            }
            index = parent;
        }
    }

    // Write a method in the HeapIntPriorityQueue class called toArray that returns the elements of 
    // the queue as a filled array. The order of the elements in the array is not important as long as all 
    // elements from the queue are present in the array, with no extra empty slots before or afterward.
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = elementData[i];
        }
        return result;
    }

    //Write a method in the HeapIntPriorityQueue class called toString that returns a string
    public String toString() {
        return Arrays.toString(toArray());
    }
    

    // Write a method in the HeapIntPriorityQueue class called merge that accepts 
    // another HeapIntPriorityQueue as a parameter and adds all elements from the other queue into 
    // the current queue, maintaining proper elementData order such that the elements will still come out in 
    // ascending order when they are removed.
    public void merge(HeapIntPriorityQueue other) {
        int[] otherArray = other.toArray();
        for (int i = 0; i < otherArray.length; i++) {
            add(otherArray[i]);
        }
    }

    // Write a method in the HeapIntPriorityQueue class called merge that accepts 
    // another HeapIntPriorityQueue as a parameter and returns a new queue that contains all of the 
    // elements from both queues, maintaining proper Heap order such that the elements will still come 
    // out in ascending order when they are removed.
    public static void main(String[] args) {
        HeapIntPriorityQueue queue1 = new HeapIntPriorityQueue();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        queue1.add(50);
        queue1.add(60);
        queue1.add(70);
        queue1.add(80);
        queue1.add(90);
        queue1.add(100);
        queue1.toArray();
        System.out.println(queue1);

        HeapIntPriorityQueue queue2 = new HeapIntPriorityQueue();
        queue2.add(5);
        queue2.add(15);
        queue2.add(25);
        queue2.add(35);
        queue2.add(45);
        queue2.add(55);
        queue2.add(65);
        queue2.add(75);
        queue2.add(85);
        queue2.add(95);
        System.out.println(queue2);
        queue1.merge(queue2);
        
    }
    

}

    

