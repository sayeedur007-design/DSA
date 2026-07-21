public class startingpointofloop {

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

        public ListNode findStartingPoint(ListNode head) {
            if(head==null || head.next==null){
                return null;
            }
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                ListNode temp=head;
                if(slow==fast){
                while(temp!=slow){
                    temp=temp.next;
                    slow=slow.next;
                }
                return temp;
            }
        }
            

            return null;
        }
    }

    public static void main(String[] args) {

        // Create nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        
        

        // Connect list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next= sixth;

        // Create loop
        // Tail points to node with value 2
        sixth.next = fourth;

        Solution obj = new Solution();

        ListNode ans = obj.findStartingPoint(head);

        if (ans != null)
            System.out.println("Starting point of loop = " + ans.val);
        else
            System.out.println("No Loop");
    }
}