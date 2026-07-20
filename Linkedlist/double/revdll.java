public class revdll {

    static class ListNode {
        int data;
        ListNode prev, next;

        ListNode(int val) {
            this.data = val;
            this.prev = null;
            this.next = null;
        }
    }

    static class Solution {

        public ListNode reverseDLL(ListNode head) {
            // Write your logic here
            if(head==null || head.next==null){
                return head;
            }
            ListNode curr=head;
            ListNode temp=null;
            while(curr!=null){
                
                temp=curr.prev;
                curr.prev=curr.next;
                curr.next=temp;
                curr=curr.prev;
            }
            



            return temp.prev;
        }
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating: 10 <-> 20 <-> 30

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        System.out.println("Original DLL:");
        print(head);

        Solution obj = new Solution();

        head = obj.reverseDLL(head);

        System.out.println("Reversed DLL:");
        print(head);
    }
}