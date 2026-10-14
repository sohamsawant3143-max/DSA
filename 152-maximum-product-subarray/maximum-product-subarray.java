class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int minEnding=nums[0];
        int maxEnding=nums[0];
        int res=nums[0];
        for(int i=1;i<n;i++){
            int b1=nums[i];
            int b2=minEnding*nums[i];
            int b3=maxEnding*nums[i];
            maxEnding=Math.max(b1,Math.max(b2,b3));
            minEnding=Math.min(b1,Math.min(b2,b3));
            res=Math.max(res,Math.max(minEnding,maxEnding));

        }
        return res;
        
    }
}