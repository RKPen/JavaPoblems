import java.util.ArrayList;
import java.util.*;

public class PracticingArrayLists {
    public ArrayList<Integer> intersect(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) == b.get(j)) {
                    c.add(a.get(i));
                }
            }
        }
        return c;
    }
    public ArrayList<String> reverse(ArrayList<String> a) {
        ArrayList<String> b = new ArrayList<String>();
        for (int i = a.size() - 1; i >= 0; i--) {
            b.add(a.get(i));
        }
        return b;
    }
    public void CapitalizePlurals(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).charAt(a.get(i).length() - 1) == 's') {
                a.set(i, a.get(i).toUpperCase());
            }
        }
    }
    public void removePlurals(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).charAt(a.get(i).length() - 1) == 's') {
                a.remove(i);
            }
        }
    }
    public ArrayList<T> Sorting(ArrayList<T> a) {
        ArrayList<T> b = new ArrayList<T>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) < a.get(j)) {
                    b.add(a.get(i));
                }
            }
        }
        return b;
    }
    
    
}
