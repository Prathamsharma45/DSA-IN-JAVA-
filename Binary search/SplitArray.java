public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 3; // try 2 or 3
        int result = splitArray(nums, m);
        System.out.println("Minimum largest sum: " + result);
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        // initial range
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // max element
            end += nums[i];                  // total sum
        }

        // binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start; // at this point start == end
    }
}
