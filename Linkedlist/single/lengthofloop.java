public class lengthofloop {

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

        public int findLengthOfLoop(ListNode head) {
            if(head==null || head.next==null){
                return 0;
            }
            ListNode slow=head;
            ListNode fast=head;
            int count=1;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                
                if(slow==fast){
                    ListNode temp=slow.next;
                    while(temp!=slow){
                        count++;
                        temp=temp.next;
                    }
                    return count;
                }
            
            }
            return 0;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.next = second;

        Solution obj = new Solution();

        int ans = obj.findLengthOfLoop(head);

        System.out.println(ans);
    }
}