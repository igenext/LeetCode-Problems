class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class solution{

    static ListNode middleNode(ListNode head) {
        int total = 0,mid=0;
        ListNode traverse = head;
        while(traverse!=null){
            total++;
            traverse = traverse.next;
        }
        mid = total/2;
        total = 0;
        traverse = head;
        while(traverse!=null){
            total++;
            if(total==mid) return traverse.next;
            traverse = traverse.next;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode funCall = middleNode(head);
        while(funCall!=null) {
            System.out.print(funCall.val + " ");
            funCall = funCall.next;
        }
    }
}