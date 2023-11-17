import java.util.*;
public class Test{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<String> d = new ArrayList<String>();
        ArrayList<String> e = new ArrayList<String>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        c = new PracticingArrayLists().intersect(a, b);
        System.out.println(c);
        d.add("hello");
        d.add("world");
        d.add("this");
        d.add("is");
        d.add("a");
        d.add("test");
        e = new PracticingArrayLists().reverse(d);
        System.out.println(e);
        new PracticingArrayLists().CapitalizePlurals(d);
        System.out.println(d);
        new PracticingArrayLists().removePlurals(d);
        System.out.println(d);
    }
}