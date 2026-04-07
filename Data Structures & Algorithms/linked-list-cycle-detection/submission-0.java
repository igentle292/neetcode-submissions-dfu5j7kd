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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet();
        if(head == null){
            return false;
        } else{
            while(head != null){
                int prev_nodes = nodes.size();
                nodes.add(head);
                if(prev_nodes == nodes.size()){
                    return true;
                }
                head = head.next;
            }
            return false;
        }
    }
}
