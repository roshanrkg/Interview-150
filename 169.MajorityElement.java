class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
                if(c>n){
                    return nums[i];
                }
            }
            c=0;
        }
        
    return -1;
    }
}
