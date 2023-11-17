import java.util.*;

public class Dynamic {

    static class StackusingQueue{

        static Queue<Integer> queue1 = new LinkedList<Integer>();
        static Queue<Integer> queue2 = new LinkedList<Integer>();
        static int currentsize;
 
        void push(int x)
        {
            queue2.add(x);
            while (!queue1.isEmpty()) {
                queue2.add(queue1.peek());
                queue1.remove();
            }
            Queue<Integer> q = queue1;
            queue1 = queue2;
            queue2 = q;
        }
 
        void pop()
        {
            if (queue1.isEmpty()){
                return;
            }
            queue1.remove();
        }
 
        int top()
        {
            if (queue1.isEmpty()){
                return -1;
            }
            return queue1.peek();
        }
 
        int size()
        {
            return queue1.size();
        }
    
 
    public static void main(String[] args)
    {
        StackusingQueue s = new StackusingQueue();
        s.push(15);
        s.push(22);
        s.push(1);
        s.push(37);
        s.push(55);
        s.push(12);
 
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println("current size: " + s.size());
    }
    }
}

