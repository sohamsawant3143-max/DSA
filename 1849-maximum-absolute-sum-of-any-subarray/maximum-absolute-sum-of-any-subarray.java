class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int res=Math.abs(nums[0]);

        int maxSum=nums[0];
        int minSum=nums[0];
        
        for(int i=1;i<n;i++){
            int b1=nums[i];
            int b2=nums[i]+maxSum;
            int b3=nums[i]+minSum;
            maxSum=Math.max(b1,Math.max(b2,b3));
            minSum=Math.min(b1,Math.min(b2,b3));
            res=Math.max(res,Math.max(Math.abs(minSum),Math.abs(maxSum)));

            

            
        }
        return res;

        
    }
}