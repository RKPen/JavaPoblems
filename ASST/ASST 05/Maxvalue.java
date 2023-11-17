import java.util.*;

public class Maxvalue {

    static class MyStacks{
        Stack<Integer> s = new Stack<Integer>();
        int maxEle;
     
        void getMax()
        {
            if (s.empty())
                System.out.print("Stack is empty\n");
            else
                System.out.print("Maximum Element in the stack is: "+maxEle + "\n");
     
        }
        void peek()
        {
            if (s.empty())
            {
                System.out.print("Stack is empty ");
                return;
            }
     
            int t = s.peek(); 
            if(t > maxEle)
                System.out.print(maxEle);
            else
                System.out.print(t);
        }
        void pop()
        {
            if (s.empty())
            {
                return;
            }
            int t = s.peek();
            s.pop();
            if (t > maxEle)
            {
                System.out.print(maxEle + "\n");
                maxEle = 2 * maxEle - t;
            }
     
            else
                System.out.print(t + "\n");
        }
        void push(int x)
        {
            if (s.empty())
            {
                maxEle = x;
                s.push(x);
                return;
            }
            if (x > maxEle)
            {
                s.push(2 * x - maxEle);
                maxEle = x;
            }
     
            else
                s.push(x);
     
            System.out.print("Number Inserted: " + x + "\n");
        }
    }
     
    // Driver Code
    public static void main(String[] args){
        MyStacks s = new MyStacks();
        s.push(3);
        s.push(5);
        s.push(70);
        s.push(19);
        s.push(18);
        s.push(100);
        s.push(15);
        s.push(85);
        s.getMax();
        }
}
