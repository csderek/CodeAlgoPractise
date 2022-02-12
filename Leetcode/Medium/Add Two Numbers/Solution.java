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
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ans.val = (l1.val + l2.val) % 10;
        ans.next = addTwoNmubersNext((l1.val+l2.val) > 9, l1, l2);
        
        return ans;
    }
    
    public ListNode addTwoNmubersNext(boolean add1, ListNode l1, ListNode l2){
        
        ListNode next1 = l1 != null ? l1.next : null;
        ListNode next2 = l2 != null ? l2.next : null;
            
        int sum = (add1 ? 1 : 0) + (next1 != null ? next1.val : 0) + (next2 != null ? next2.val : 0);
        
        if(sum > 0 || next1 != null || next2 != null){
            ListNode ans = new ListNode();
            ans.val = sum % 10;
            ans.next = addTwoNmubersNext(sum > 9, next1, next2);
            return ans;
        }
        return null;
    }
}