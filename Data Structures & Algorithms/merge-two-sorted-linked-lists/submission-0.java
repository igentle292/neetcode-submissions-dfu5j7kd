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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return list1;
        }

        ListNode head = null;
        ListNode curr = null;
        while(list1 != null || list2 != null){
            if(list1 == null){
                if(head == null){
                    return list2;
                } else{
                    curr.next = list2;
                    return head;
                }
            } else if(list2 == null){
                if(head == null){
                    return list1;
                } else{
                    curr.next = list1;
                    return head;
                }
            } else{
                // System.out.println("List1: " + list1.val + " List2: " + list2.val);
                if(list1.val > list2.val){
                    if(head == null){
                        head = new ListNode(list2.val);
                        curr = head;
                    } else{
                        curr.next = new ListNode(list2.val);
                        curr = curr.next;
                    }
                    list2 = list2.next;
                } else{
                    if(head == null){
                        head = new ListNode(list1.val);
                        curr = head;
                    } else{
                        curr.next = new ListNode(list1.val);
                        curr = curr.next;
                    }
                    list1 = list1.next;
                }
            }
        }
        return head;
    }
}