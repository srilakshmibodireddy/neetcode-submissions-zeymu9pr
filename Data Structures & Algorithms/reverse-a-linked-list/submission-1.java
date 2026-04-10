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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        //ArrayList<ListNode> listNodes = new ArrayList<ListNode>();
        ListNode prev = null;
        ListNode curr = head;
        //0,1,2,3
        //loop1 prev=0, curr=2
        //loop2 prev=1, curr=3
        //loop3 prev=2, curr=null
        while (curr != null) {
            ListNode nextTemp = curr.next; //1
            curr.next = prev; //null
            prev = curr; // 0
            curr = nextTemp; //1
            
        }

        /*int n = listNodes.size();
        ListNode newListNode = listNodes.get(n - 1);
        curr = newListNode;
        for (int i = n - 2; i >= 0; i--) {
            curr.next = listNodes.get(i);
            curr = curr.next;
            curr.next = null;
        }*/
        
        return prev;
    }
}
