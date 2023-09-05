// 138. Copy List with Random Pointer
// ==================================


/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Duplicate each node and insert it immediately after the original node
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        // Step 2: Update the random pointers of the copied nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        // Step 3: Split the combined list into two separate lists
        Node newHead = head.next;
        current = head;
        Node currentNew = newHead;
        while (current != null) {
            current.next = currentNew.next;
            current = current.next;
            if (current != null) {
                currentNew.next = current.next;
                currentNew = currentNew.next;
            }
        }

        return newHead;
    }
}