public class mergetwosortedlist {

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

        public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
            if(head1==null || head2==null){
                return head1==null? head2:head1;
            }
            if(head1.val<=head2.val){
                head1.next=mergeTwoLists(head1.next, head2);
                return head1;
            }
            else{
                head2.next=mergeTwoLists(head1, head2.next);
                return head2;
            }

            
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

        // List 1: 1 -> 3 -> 5

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // List 2: 2 -> 4 -> 6

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        System.out.print("List 1: ");
        print(list1);

        System.out.print("List 2: ");
        print(list2);

        Solution obj = new Solution();

        ListNode merged = obj.mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        print(merged);
    }
}