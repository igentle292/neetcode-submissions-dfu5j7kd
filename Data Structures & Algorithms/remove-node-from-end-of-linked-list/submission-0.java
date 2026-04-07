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
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }

        int idx = length - n;
        curr = head;
        ListNode prev = null;
        int i=0;
        while(curr != null){
            if(i == idx){
                if(prev == null){
                    head = head.next;
                } else{
                    prev.next = curr.next;
                }
                return head;
            } 
            prev = curr;
            curr = curr.next;
            i++;
        }


        return head;
    }
}
