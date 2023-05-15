// 1721. Swapping Nodes in a Linked List
// =====================================

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, slow = head, flag = head;
        for(int i = 0; i < k-1; i++){
            fast = fast.next;
        }
        flag = fast;
        while(fast.next!= null){
            slow = slow.next;
            fast = fast.next;
        }
        int temp = slow.val;
        slow.val = flag.val;
        flag.val = temp;
        return head;
    }
}