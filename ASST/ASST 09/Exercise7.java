import java.util.*;

public class Exercise7 {
    private static class ListNode{
        String key;
        String value;
        ListNode next;
    }
    public static void put(ListNode head, String key, String value){
        ListNode node = head;
        while(node != null){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
            node = node.next;
        }
        ListNode newNode = new ListNode();
        newNode.key = key;
        newNode.value = value;
        newNode.next = head;
        head = newNode;
    }

    public static String get(ListNode head, String key){
        ListNode node = head;
        while(node != null){
            if(node.key.equals(key)){
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public static void remove(ListNode head, String key){
        ListNode node = head;
        while(node != null){
            if(node.key.equals(key)){
                node = node.next;
                return;
            }
            node = node.next;
        }
    }

    public static boolean containsKey(ListNode head, String key){
        ListNode node = head;
        while(node != null){
            if(node.key.equals(key)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.key = "a";
        head.value = "1";
        put(head, "b", "2");
        put(head, "c", "3");
        put(head, "d", "4");
        put(head, "e", "5");
        put(head, "f", "6");
        put(head, "g", "7");
        System.out.println(get(head, "a"));
        remove(head, "c");
        System.out.println(containsKey(head, "k"));
    }
}
