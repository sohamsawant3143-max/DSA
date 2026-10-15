class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int noDelete=arr[0];
        int oneDelete=Integer.MIN_VALUE;
        int res=arr[0];
        for(int i=1;i<n;i++){
            int prevNoDelete=noDelete;
            int prevOneDelete=oneDelete;
            int b1=arr[i];
            int b2=arr[i]+noDelete;
            noDelete=Math.max(b1,b2);
            int b3;
            if(prevOneDelete==Integer.MIN_VALUE){
                b3=arr[i];
            }
            else{
                b3=prevOneDelete+arr[i];
            }
            oneDelete=Math.max(b3,prevNoDelete);
            res=Math.max(res,Math.max(noDelete,oneDelete));
        }
        return res;
        
    }
}