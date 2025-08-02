public class slidingwindow {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int k = 3;
        int n = nums.length;
        int windowsum = 0;

        for (int i = 0; i < k; i++) {
            windowsum += nums[i];
        }

        for (int i = k; i < n; i++) {
            windowsum += nums[i] - nums[i - k];
            max = Math.max(windowsum, max);

        }
        return max;
    }


        public static void main (String[]args){
            int[] nums = {2,-3,4,-5,6,-9};
            System.out.println(maxSubArray(nums));
        }
    }

