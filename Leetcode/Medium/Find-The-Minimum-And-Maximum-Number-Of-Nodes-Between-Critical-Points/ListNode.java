import java.util.*;
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int prev = head.val;
        ListNode cur = head.next;
        int index = 1;

        List<Integer> criticalPts = new ArrayList<Integer>();

        while(cur != null && cur.next != null){
            int next = cur.next.val;
            if((cur.val < prev && cur.val < next) || 
                (cur.val > prev && cur.val > next)){
                criticalPts.add(index);
            }

            prev = cur.val;
            index++;
            cur = cur.next;
        }


        if(criticalPts.size() == 0 || criticalPts.size() == 1) return new int[]{-1,-1};

        int max = criticalPts.get(criticalPts.size()-1) - criticalPts.get(0);
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < criticalPts.size(); i ++){
            if(min > criticalPts.get(i) - criticalPts.get(i-1)){
                min = criticalPts.get(i) - criticalPts.get(i-1);
            }
        }

        return new int[]{min,max};
    }
}

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}