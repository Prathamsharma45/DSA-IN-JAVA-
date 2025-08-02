class SlidingWindow {
    static int maxSubArray(int[] nums) {
        int k = 3;
        int n = nums.length;
        if (n < k) return 0; // edge case
        int even=0;

        int max = Integer.MIN_VALUE;
        int windowSum = 0;

        // Calculate initial window sum

        max = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            max = Math.max(max, windowSum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, -3, 4, -5, 6, -9};
        System.out.println("Max sum of subarray of size 3: " + maxSubArray(nums));
    }
}


