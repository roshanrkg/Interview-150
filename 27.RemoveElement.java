class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == val) {
                // Shift everything left from i
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--; // reduce effective size
            } else {
                i++;
            }
        }

        return n; // total elements not equal to val
    }
}