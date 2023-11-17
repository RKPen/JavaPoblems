import java.util.*;
 
class Circular{

static class Queue {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
 
    void enQueue(int x)
    {
        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }
    int deQueue()
    {
        if (stack1.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }
        int x = stack1.peek();
        stack1.pop();
        return x;
    }
}
public static void main(String[] args)
{
    Queue q = new Queue();
    q.enQueue(19);
    q.enQueue(22);
    q.enQueue(37);
 
    System.out.println(q.deQueue());
    System.out.println(q.deQueue());
    System.out.println(q.deQueue());
}
}
