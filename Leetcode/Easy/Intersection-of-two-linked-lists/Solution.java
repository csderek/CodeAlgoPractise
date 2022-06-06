import java.util.*;

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> ASet = new HashSet<ListNode>();
        while(headA != null){
            ASet.add(headA);
            headA = headA.next;
        }
        
        while(headB != null){
            if(ASet.contains(headB)) return headB;
            headB = headB.next;
        }
        
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}