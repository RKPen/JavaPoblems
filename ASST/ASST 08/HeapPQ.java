import java.util.*;
public class HeapPQ<K,V> {
    /** primary collection of priority queue entries */
    private ArrayList<Entry<K,V>> heap = new ArrayList<>();
    private Comparator<K> comp;
  
    /** Creates an empty priority queue based on the natural ordering of its keys. */
    public HeapPQ() { comp = new DefaultComparator<K>(); }
  
    // Creates an empty priority queue using the given comparator to order keys.
   public HeapPQ(Comparator<K> c) {  comp = c;}


   //Creates a priority queue initialized with the respective
   //key-value pairs.  The two arrays given will be paired
   //element-by-element. They are presumed to have the same
   //length. (If not, entries will be created only up to the length of
   //the shorter of the arrays)
   public HeapPQ(K[] keys, V[] values) {
    comp = new DefaultComparator<K>();
    for (int j=0; j < Math.min(keys.length, values.length); j++)
        heap.add(new Entry<>(keys[j], values[j]));
    heapify();
   }

    //Returns the number of items in the priority queue.
    public int size() { return heap.size(); }

    public boolean isEmpty() { return size() == 0; }

      // private utilities
    private int parent(int j) { return (j-1) / 2; }     // truncating division
    private int left(int j) { return 2*j + 1; }
    private int right(int j) { return 2*j + 2; }
    private boolean hasLeft(int j) { return left(j) < heap.size(); }
    private boolean hasRight(int j) { return right(j) < heap.size(); }

    //Exchanges the entries at indices i and j of the array list. */
    private void swap(int i, int j) {
        Entry<K,V> temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    //Moves the entry at index j higher, if necessary, to restore the heap property. 
    private void upheap(int j) {
        while (j > 0) {            // continue until reaching root (or break statement)
            int p = parent(j);
            if (compare(heap.get(j), heap.get(p)) >= 0) break; // heap property verified
            swap(j, p);
            j = p;                                // continue from the parent's location
        }
    }

    // Moves the entry at index j lower, if necessary, to restore the heap property.
    private void downheap(int j) {
        while (hasLeft(j)) {               // continue to bottom (or break statement)
            int leftIndex = left(j);
            int smallChildIndex = leftIndex;     // although right may be smaller
            if (hasRight(j)) {
                int rightIndex = right(j);
                if (compare(heap.get(leftIndex), heap.get(rightIndex)) > 0)
                    smallChildIndex = rightIndex;  // right child is smaller
            }
            if (compare(heap.get(smallChildIndex), heap.get(j)) >= 0)
                break;                             // heap property has been restored
            swap(j, smallChildIndex);
            j = smallChildIndex;                 // continue at position of the child
        }
    }

    // Performs a bottom-up construction of the heap in linear time. 
    private void heapify() {
        int startIndex = parent(size()-1);    // start at PARENT of last entry
        for (int j=startIndex; j >= 0; j--)   // loop until processing the root
            downheap(j);
    }
   
    //Inserts a key-value pair and returns the entry created.
    public Entry<K,V> insert(K key, V value) {
        Entry<K,V> newest = new Entry<>(key, value);
        heap.add(newest);                      // add to the end of the list
        upheap(heap.size() - 1);               // upheap newly added entry
        return newest;     
    }

   // returns an entry with minimal key.
    public Entry<K,V> min() {
        if (heap.isEmpty()) return null;
        return heap.get(0);
    }
  
    //Removes and returns an entry with minimal key.
    public Entry<K,V> removeMin() {
        if (heap.isEmpty()) return null;
        Entry<K,V> answer = heap.get(0);
        swap(0, heap.size() - 1);              // put minimum item at the end
        heap.remove(heap.size() - 1);          // and remove it from the list;
        downheap(0);                           // then fix new root
        return answer;
      }
     
    // Method for comparing two entries according to key 
    public int compare(Entry<K,V> a, Entry<K,V> b) {
        return comp.compare(a.getKey(), b.getKey());
    }

    public static void main(String[] args) {
        HeapPQ<String, Student> heap = new HeapPQ<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the first name of the student: ");
            String firstName = input.next();
            System.out.println("Enter the last name of the student: ");
            String lastName = input.next();
            System.out.println("Enter the student ID: ");
            int id = input.nextInt();
            System.out.println("Enter the grade: ");
            int grade = input.nextInt();
            Student student = new Student(firstName, lastName, id, grade);
            heap.insert(firstName, student);
        }
        System.out.println("Enter the key parameter: ");
        String key = input.next();
        System.out.println("Enter the order: ");
        String order = input.next();
        if (key.equals("first name")) {
            if (order.equals("ascending")) {
                while (!heap.isEmpty()) {
                    System.out.println(heap.removeMin().getValue());
                }
            } else if (order.equals("descending")) {
                while (!heap.isEmpty()) {
                    System.out.println(heap.removeMin().getValue());
                }
            }
        } else if (key.equals("last name")) {
            if (order.equals("ascending")) {
                while (!heap.isEmpty()) {
                    System.out.println(heap.removeMin().getValue());
                }
            } else if (order.equals("descending")) {
                while (!heap.isEmpty()) {
                    System.out.println(heap.removeMin().getValue());
                }
            }
        } else if (key.equals("student ID")) {
            if (order.equals("ascending")) {
                while (!heap.isEmpty()) {
                    System.out.println(heap.removeMin().getValue());
                }
            } else if (order.equals("descending")) {
                while (!heap.isEmpty()) {
                    System.out.println(heap.removeMin().getValue());
                }
            }
        } else if (key.equals("grade")) {
            if (order.equals("ascending")) {
                while (!heap.isEmpty()) {
                    System.out.println(heap.removeMin().getValue());
                }
            } else if (order.equals("descending")) {
                while (!heap.isEmpty()) {
                    System.out.println(heap.removeMin().getValue());
                }
            }
        }
    }

      
}  