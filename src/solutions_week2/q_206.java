package solutions;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class LinkedList {
    ListNode head;
    int size;

    LinkedList() {
        head = null;
        size = 0;
    }

    void add(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    int getSize() {
        return size;
    }
}


public class q_206 {

    public static LinkedList reverseList(LinkedList head) {



    }





    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        reverseList(list);
    }


}
