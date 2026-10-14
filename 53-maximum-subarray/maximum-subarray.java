class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int bestEnding=nums[0];
        int res=nums[0];
        for(int i=1;i<n;i++){
            int b1=nums[i];
            int b2=nums[i]+bestEnding;
            bestEnding=Math.max(b1,b2);
            res=Math.max(res,bestEnding);

        
        }
        return res;

        
    }
}