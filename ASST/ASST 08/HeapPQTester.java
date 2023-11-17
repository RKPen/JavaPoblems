import java.util.*;
public class HeapPQTester {     
    public static void main(String[] args) {

        class stringLengthComparator implements Comparator<String> {
           public int compare(String s1, String s2) {
               return s1.length() - s2.length();
           }
        }
        //construct an empty tree
        HeapPQ<Integer, Student> PQ = new HeapPQ<>();
        Student s1 = new Student("Mike", "Smith", 100);
        Student s2 = new Student("Ali", "Ward", 90);
        Student s3= new Student("Hadi", "Audi", 200);
        Student s4= new Student("Laure", "Fani", 10);
        Student s5= new Student("Omar", "BenKhodor", 9);
        Student s6= new Student("Robert", "Deniro", 20);
        PQ.insert(s1.getStudentId(), s1);
        PQ.insert(s2.getStudentId(), s2);
        PQ.insert(s3.getStudentId(), s3);
        PQ.insert(s4.getStudentId(), s4);
        PQ.insert(s5.getStudentId(), s5);
        PQ.insert(s6.getStudentId(), s6);
        while (!PQ.isEmpty()){ 
            System.out.print(PQ.removeMin().getValue().toString()+"; ");
        }
        System.out.println();
    }
}
