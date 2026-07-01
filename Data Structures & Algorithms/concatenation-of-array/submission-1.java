class Solution {
    public int[] getConcatenation(int[] nums) {
        // int ans[] = new int[2*nums.length];
        // int k = 0;
        // for(int i = 0;i<2;i++){
        //     for(int j=0;j<nums.length;j++){
        //          ans[k] = nums[j];
        //          k++;
        //     }
        // }
        // return ans;
        int n = nums.length;
        int k = 0;
        int m = n;
        int ans[] = new int[2*n];
        for(int i=0;i<n;i++){
            ans[k] = nums[i];
            ans[m] = nums[i];
            k++;
            m++;
        }
        return ans;
    }
}