class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int[] arr = new int[n];
        int c=0;
        k = k % n;
        for(int i=n-k;i<n;i++){
            arr[c]= nums[i];
            c++;
        }
        for(int j=0;j<n-k;j++){
            arr[c]=nums[j];
            c++;
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}
