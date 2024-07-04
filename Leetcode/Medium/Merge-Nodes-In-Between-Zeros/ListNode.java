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
    public ListNode mergeNodes(ListNode head) {
        int total = 0;
        ListNode curr = head;

        ListNode resultHead = new ListNode();
        ListNode curResult = new ListNode();

        while(curr != null){
            if(curr.val == 0 && total > 0){
                ListNode newNode = new ListNode(total);

                if(resultHead.val == 0){
                    resultHead = newNode;
                    curResult = resultHead;
                }else{
                    curResult.next = newNode;
                    curResult = newNode;
                }

                total = 0;

            }else if(curr.val > 0){
                total += curr.val;
            }
            curr = curr.next;
        }

        return resultHead;
    }
}


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}