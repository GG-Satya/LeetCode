// 445. Add Two Numbers II
// =======================

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = addToStack(l1),  st2 = addToStack(l2);
        ListNode head = null;
        int carry = 0;
        while(st1.size() > 0 || st2.size() > 0 || carry != 0){
            int sum = carry;
            if(st1.size() > 0)sum += st1.pop();
            if(st2.size() > 0)sum += st2.pop();
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head;
            head = newNode;
            carry = sum / 10;
        }
        return head;
    }
    private Stack<Integer> addToStack(ListNode l){
        Stack<Integer> st = new Stack<>();
        while(l != null){
            st.add(l.val);
            l = l.next;
        }
        return st;
    }
}