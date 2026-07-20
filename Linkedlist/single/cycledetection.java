public class cycledetection {

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

        public boolean hasCycle(ListNode head) {

            // Write your logic here
            ListNode slow=head;
            ListNode fast=head;
            //TO remove cycle we can use prev;
            //ListNode prev=null; 


            while(fast!=null && fast.next!=null){
                slow=slow.next;
                //prev=fast;            //here prev stores the previous value of fasts
                fast=fast.next.next;
                if(slow==fast){                   //Dont compare slow.val==fast.val that's wrong nigga 
                    return true;
                }
            }
            //prev.next=null;          // By giving prevnext pointing to null we can remove the loop
            return false;
        }
    }

    static void print(ListNode head, int limit) {
        int count = 0;
        while (head != null && count < limit) {
            System.out.print(head.val + " ");
            head = head.next;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating:
        // 1 -> 2 -> 3 -> 4 -> 5
        //           ^         |
        //           |_________|

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create Cycle (5 -> 2)
        fifth.next = second;

        Solution obj = new Solution();

        boolean ans = obj.hasCycle(head);

        System.out.println("Cycle Present: " + ans);
    }
}