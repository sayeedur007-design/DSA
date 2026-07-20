public class fastslowpointer {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
            val = 0;
            next = null;
        }

        ListNode(int data) {
            val = data;
            next = null;
        }

        ListNode(int data, ListNode next) {
            val = data;
            this.next = next;
        }
    }

    static class Solution {

        public ListNode middleOfLinkedList(ListNode head) {

            // Write your Slow & Fast Pointer logic here
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            return slow;
        }
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating:
        // 3 -> 8 -> 7 -> 1 -> 3

        ListNode head = new ListNode(3);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(7);
        ListNode fourth = new ListNode(1);
        ListNode fifth = new ListNode(3);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.print("Linked List: ");
        print(head);

        Solution obj = new Solution();

        ListNode middle = obj.middleOfLinkedList(head);

        System.out.println("Middle Node: " + middle.val);
    }
}