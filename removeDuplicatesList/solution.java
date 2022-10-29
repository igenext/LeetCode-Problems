import java.util.*;

class ListNode {
int val;
 ListNode next;
  ListNode() {}
ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 class solution{


    static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node!=null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            node = node.next;
        }  
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode node = deleteDuplicates(head);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }

    }

 }