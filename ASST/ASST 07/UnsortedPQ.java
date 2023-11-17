import java.util.*;

public class UnsortedPQ<K,V> {
    /** primary collection of priority queue entries */
    private LinkedList<Entry<K,V>> list = new LinkedList<>();
    private Comparator<K> comp;
  
    /** Creates an empty priority queue based on the natural ordering of its keys. */
    public UnsortedPQ() { 
        comp = new DefaultComparator<K>();
    }
  
    // Creates an empty priority queue using the given comparator to order keys.   
    public UnsortedPQ(Comparator<K> c) { 
       comp = c;
    }
  
    // Returns the the entry having minimal key.
    private Entry<K,V> findMin() {    // only called when nonempty
      Entry<K,V> small = list.getFirst(); 
      for (Entry<K,V> walk : list)
        if (compare(walk, small) < 0)
          small = walk;      // found an even smaller key
      return small;
    }
  
    //Inserts a key-value pair and returns the entry created.
    public Entry<K,V> insert(K key, V value)  {
      Entry<K,V> newest = new Entry<>(key, value);
      list.addLast(newest);
      return newest;
    }
  
    //Returns (but does not remove) an entry with minimal key.
    public Entry<K,V> min() {
      if (list.isEmpty()) return null;
      return findMin();
    }
  
    //Removes and returns an entry with minimal key.
    public Entry<K,V> removeMin() {
      if (list.isEmpty()) return null;
      Entry<K,V> e = findMin();
      if (list.remove(e)) return e;
      else   return null;
    }
  
    //Returns the number of items in the priority queue.
    public int size() { return list.size(); }

    public boolean isEmpty() { return size() == 0; }

     /** Method for comparing two entries according to key */
  public int compare(Entry<K,V> a, Entry<K,V> b) {
    return comp.compare(a.getKey(), b.getKey());
  }
} 