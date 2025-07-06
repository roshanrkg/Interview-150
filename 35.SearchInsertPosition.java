class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(n==0){
            return -1;
        }
       for(int i=0;i<n;i++){
        if(target < nums[i]){
            return 0;
        }
        if(nums[i]==target){
            return i;
        }
        if(i<n-1){
        if(nums[i]<target && nums[i+1]>target){
            return i+1;
        }
        }

        if(i==n-1){
            return i+1;
        
        }
       }
       return -1;
    }
}
