class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class solution{

  static int getDecimalValue(ListNode head) {
      int count = 0,result=0;
      ListNode temp = head;
      while(temp!=null){
          count++;
          temp = temp.next;
      }
      temp = head;
      while(temp!=null){
          
          result+=temp.val*Math.pow(2, --count);
          temp = temp.next;
      }
      return result;
  }

  public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(0);
      head.next.next = new ListNode(1);
      System.out.println(getDecimalValue(head));
  }
}
