import java.util.ArrayList;
import java.util.*;

public class MyArrays {
    public static int linearSearch(int[] array, int key , int start , int end ) {
        for (int i = start; i <= end; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void fill(int[] array, int value , int start , int end) {
        for (int i = start; i <= end; i++) {
            if(array[1] != value) {
                array[i] = value;
            }
        }
        
    }
    public static ArrayList<Integer> copyOf(int[] array, int start , int end) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            list.add(array[i]);
        }
        return list;
    }
    public static String toString(int[] array) {
        String str = "";
        str+= "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i] + ", ";
        }
        str += "]";
        return str;
        
        
    }
    public static void sort(int[] array , int start , int end) {
        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
    }
    
}
