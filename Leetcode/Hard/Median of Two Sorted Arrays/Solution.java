class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArr = new int[nums1.length+ nums2.length];
        int s1 = 0;
        int s2 = 0;
        for(int i = 0; i < nums1.length+ nums2.length; i++){
            if(s1 < nums1.length && s2 < nums2.length){
                mergeArr[i] = nums1[s1] < nums2[s2] ? nums1[s1] : nums2[s2];
                if(nums1[s1] < nums2[s2]){
                    s1++;
                }else{
                    s2++;
                }
            }else{
                if(s1 == nums1.length){
                    mergeArr[i] = nums2[s2];
                    s2++;
                }else{
                    mergeArr[i] = nums1[s1];
                    s1++;
                }
            }
        }
        
        if(mergeArr.length % 2 != 0){
            return mergeArr[mergeArr.length/2];
        }else{
            return ((double) (mergeArr[mergeArr.length/2] + mergeArr[mergeArr.length/2 -1]))/2;
        }
    }
}