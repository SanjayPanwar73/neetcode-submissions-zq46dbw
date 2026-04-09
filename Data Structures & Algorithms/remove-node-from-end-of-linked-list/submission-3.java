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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++; 
        }

        if(size == n){
            head = head.next;
            return head;
        }

        int i = 0;
        int iTofind = size - n -1;
        ListNode delete = head;

        while(i<iTofind){
            delete = delete.next;
            i++;
        }
         delete.next = delete.next.next;
        
        return head;
    }
}
