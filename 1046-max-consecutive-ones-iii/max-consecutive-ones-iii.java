class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int res=Integer.MIN_VALUE;
        int zeroes=0;
        for(int high=0;high<n;high++){
            if(nums[high]==0){
                zeroes++;

            }
            while(zeroes>k){
                if(nums[low]==0){
                    zeroes--;
                }
                low++;
            }
            int len=high-low+1;
            res=Math.max(res,len);


        }
        return res;
        

        
    }
}