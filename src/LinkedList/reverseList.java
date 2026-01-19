package LinkedList;



public class reverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode temp=head;
        ListNode curr=head.next;
        head.next=null;
        head=curr;
        while(head!=null){
            curr=head.next;
            head.next=temp;
            temp=head;
            head=curr;
        }
        return temp;
    }
    public static void main(String[] args) {
        ListNode n3 = new ListNode(3, null);
        ListNode n2 = new ListNode(2, n3);
        ListNode head = new ListNode(1, n2);

        reverseList obj = new reverseList();
        ListNode temp=head;
        System.out.print("Original List: ");
        while(temp!=null){
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp=temp.next;
        }
        System.out.println();

        ListNode newHead = obj.reverseList(head);

        System.out.print("Reversed list: ");
        ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
    }
}
