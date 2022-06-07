class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        
        int i1 = 0, i2 = 0;
        
        int[] result = new int[nums1.length];
        int c = 0;
        while(i1 < m || i2 < n){
            if(i2 == n || (i1 < m && nums1[i1] <= nums2[i2])){
                //System.out.println("A");
                result[c] = nums1[i1];
                i1++;
            }else{
                //System.out.println("B");
                result[c] = nums2[i2];
                i2++;
            }
            c++;
        }
        //System.out.println(Arrays.toString(result));
        //System.arraycopy(nums1, 0, result, 0, result.length);
        for(int i = 0; i < m + n; i++){
            nums1[i] = result[i];
        }
        
    }
}