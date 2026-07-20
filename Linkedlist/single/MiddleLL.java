public class MiddleLL {

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

            // Write your logic here
            int count=0;
            ListNode curr=head;
            while(curr!=null){
                count++;
                curr=curr.next;
            }
            ListNode mid=head;
            for(int i=0;i<(count/2);i++){
                mid=mid.next;
            }

            return mid;
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