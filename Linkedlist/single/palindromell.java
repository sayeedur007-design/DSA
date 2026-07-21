public class palindromell {

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

        public boolean isPalindrome(ListNode head) {
            if(head.next==null){
                return true;
            }
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode curr=slow;
            ListNode prev=null;
            ListNode next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode start=head;
            ListNode mid=prev;
            while(mid!=null){
                if(start.val!=mid.val){
                    return false;
                }
                    mid=mid.next;
                    start=start.next;
                
            }
            
            return true;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode second = new ListNode(7);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(3);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Solution obj = new Solution();

        boolean ans = obj.isPalindrome(head);

        System.out.println(ans);
    }
}