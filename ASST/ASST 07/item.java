import java.util.Deque;

public class item {

        private int value;
        private int priority;
        static item[] pq = new item[10];
        static int size = -1;
        

        public item(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }

        public int getValue() {
            return value;
        }

        public int getPriority() {
            return priority;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }


        //EnQueue operation inserts an item into the queue.

        public static void enQueue(int value, int priority) {
            size++;
            pq[size] = new item(value, priority);
            pq[size].value = value;
            pq[size].priority = priority;
        }

            

        //DeQueue operation removes the item with the highest priority from the queue.

        public static void DeQueue() {
            for (int i = 0; i < size; i++) {
                pq[i] = pq[i + 1];
                }
                size--;
        
        }
        
        public static int peek()
        {
            int highestPriority = Integer.MIN_VALUE;
            int index= -1;
            for (int i = 0; i <= size; i++) {

              if (highestPriority == pq[i].priority && index > -1
                && pq[index].value < pq[i].value) {
                highestPriority = pq[i].priority;
                index = i;
              }
              else if (highestPriority < pq[i].priority) {
                highestPriority = pq[i].priority;
                index = i;
              }
            }

            return index;
          }
    
    public static void main(String[] args) {
        enQueue(0,2);
        enQueue(2,3);
        enQueue(5,4);
        enQueue(9,4);
        enQueue(8,5);
        enQueue(6,1);
        enQueue(7,2);
        enQueue(4,2);
        enQueue(1,1);
        enQueue(3,3);
        DeQueue();
        System.out.println("The highest priority is: " + pq[peek()].value);
        System.out.println(peek());
        
        
    }
}
    
    

