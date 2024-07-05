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
        int preIndex = -1;
        int firstIndex = -1;
        int min = Integer.MAX_VALUE;

        List<Integer> criticalPts = new ArrayList<Integer>();

        while(cur != null && cur.next != null){
            int next = cur.next.val;
            if((cur.val < prev && cur.val < next) || 
                (cur.val > prev && cur.val > next)){
                if(preIndex > -1){
                    if(min > index - preIndex){
                        min = index - preIndex;
                    }
                }else{
                    firstIndex = index;
                }

                preIndex = index;
            }

            prev = cur.val;
            index++;
            cur = cur.next;
        }

        if(firstIndex == -1 || firstIndex == preIndex) return new int[]{-1,-1};

        int max = preIndex - firstIndex;

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