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

    public ListNode oddEvenList(ListNode head) {

        if(head == null)return head;

        ListNode odd = head, even= head.next, evenHead= even;

        while(even!=null && even.next != null){

            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        // joining even node starting point with ending of odd node chain
        odd.next= evenHead;  

        return head;
    }
}