class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;
        
        // If total sum equals x, we must remove all elements
        if (target == 0) return nums.length;
        // If target < 0, it's impossible to sum to x
        if (target < 0) return -1;

        int left = 0;
        int currentSum = 0;
        int maxLen = -1;

        // Sliding window to find longest subarray with sum == target
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum > target && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}