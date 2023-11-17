import java.util.*;
public class Test{
    public static void main(String[] args){
        int[] array1 = {4,5,6,5,7,1,5,9};
        System.out.println(MyArrays.linearSearch(array1, 5, 0, array1.length - 1));
        int [] left = {1,3,3};
        int [] right = {1,3,3};
        System.out.println(MyArrays.equals(left, right));
        MyArrays.fill(array1, 0, 2, array1.length - 1);
        System.out.println(MyArrays.copyOf(array1, 0, array1.length - 1));
        MyArrays.sort(array1, 0, array1.length - 1);
        System.out.println(MyArrays.toString(array1));
    }

}