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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next != null){
            // int small_num = Math.min(curr.val, curr.next.val);
            // int big_num = Math.max(curr.val, curr.next.val);

            // int gcd = gcd(big_num, small_num);
            int gcd = gcd(curr.val, curr.next.val);
            ListNode gcd_node = new ListNode(gcd, curr.next);
            curr.next = gcd_node;
            curr = curr.next.next;
        }
        return head;
    }

    public int gcd(int num1, int num2){
        while(num2 > 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}