/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }



    public void reorderList(ListNode head) {
        if(head ==null || head.next ==null){
            return;
        }

        //mid
        ListNode mid = findMid(head);

        //reverse
        ListNode SLL = reverse(mid.next);
        mid.next = null;

        ListNode FLL = head;

        while(SLL != null){
            ListNode t1 = FLL.next;
            ListNode t2 = SLL.next;

            FLL.next = SLL;
            SLL.next = t1;

            FLL = t1;
            SLL = t2;
        }

       
    } 
}
