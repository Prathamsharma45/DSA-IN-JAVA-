public class Infinite {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 10;
        int result = new Infinite().ans(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public int ans (int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            start = end;
            end = end+(end - start + 1) * 2; // double the range
            
        }
        return binarysearch(arr, target, start, end);
    }

    
    

        public static int binarysearch(int[] arr, int target,int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
    
        return -1; 
    }
}

