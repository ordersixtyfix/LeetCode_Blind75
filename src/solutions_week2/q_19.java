package solutions_week2;

public class q_19 {

    public static class ListNode {
      int val;
          ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int length=0;
        int count=1;

        while(head!=null){
            length++;
            head = head.next;

        }

        while(temp!=null){
            if(count==length-n){
                temp.next=temp.next.next;
            }
            temp = temp.next;
            count++;
        }

        return temp;

    }
    public static void main(String[] args) {


        ListNode node = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        removeNthFromEnd(node,2);





    }


}
