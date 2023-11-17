import java.util.*;
public class PQTester {     
    public static void main(String[] args) {

        class stringLengthComparator implements Comparator<String> {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        }
        class intComparator implements Comparator<Integer> {
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        }
        //construct an empty tree
        SortedPQ<String, Student> PQ = new SortedPQ<>();
        Student s1 = new Student("Mike", "Smith");
        Student s2 = new Student("Ali", "Ward");
        Student s3= new Student("Hadi", "Audi");
        Student s4= new Student("Laure", "Fani");
        PQ.insert(s1.getLastName().toLowerCase(), s1);
        PQ.insert(s2.getLastName().toLowerCase(), s2);
        PQ.insert(s3.getLastName().toLowerCase(), s3);
        PQ.insert(s4.getLastName().toLowerCase(), s4);
        while (!PQ.isEmpty()){ 
            System.out.print(PQ.removeMin().getValue().toString()+"; ");
        }
        System.out.println();


        //construct an empty tree
        SortedPQ<String, Student> PQ1 = new SortedPQ<>(new stringLengthComparator());
        
        PQ1.insert(s1.getFirstName(), s1);
        PQ1.insert(s2.getFirstName(), s2);
        PQ1.insert(s3.getFirstName(), s3);
        PQ1.insert(s4.getFirstName(), s4);
        while (!PQ1.isEmpty()){ 
            System.out.print(PQ1.removeMin().getValue().toString()+"; ");
        }
        System.out.println();

        Sorted<Integer, Student> PQ2 = new SortedPQ<>(new intComparator());
        PQ2.insert(s1.getFirstName(), s1);
        PQ2.insert(s2.getFirstName(), s2);
        PQ2.insert(s3.getFirstName(), s3);
        PQ2.insert(s4.getFirstName(), s4);
        while (!PQ2.isEmpty()){ 
            System.out.print(PQ2.removeMin().getValue().toString()+"; ");
        }
        PQ2.exists(1, s1);
    }
}
