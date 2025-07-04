class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1}; 

        if (nums == null || nums.length == 0) {
            return result;
        }

        int n = nums.length;

        // Find the first occurrence
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }

        // Find the last occurrence only if the first is found
        if (result[0] != -1) {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] == target) {
                    result[1] = i;
                    break;
                }
            }
        }

        return result;
    }
}
