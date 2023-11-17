import java.util.*;

public class Node implements Comparable<Node> {

        private int value;
        private int priority;
        static PriorityQueue<Node> pq = new PriorityQueue<>();

        public Node(int value, int priority) {
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

        public int compareTo(Node n){
            if(this.priority > n.priority){
                return 1;
            }
            else if(this.priority < n.priority){
                return -1;
            }
            else{
                return 0;
            }
        }

        public static void enQueue(int value, int priority) {
            pq.add(new Node(value, priority));
            
        }

        public static void deQueue(){
            pq.poll();

        }

        public static Node peek(){
            return pq.peek();
        }

        public String toString(){
            return "Value: " + value + " Priority: " + priority;
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
        deQueue();
        System.out.println(peek());
    }

    
}
