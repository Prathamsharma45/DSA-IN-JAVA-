public class peakindex {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5};
        int peakIndex = peakIndex(arr); 
        System.out.println("Peak Index: " + peakIndex);
    }
    public static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1; // Move to the right side
            } else {
                end = mid; // Move to the left side
            }
        }

        return start; // Peak index found
    }
}
