import java.util.ArrayList;

public class MergeUsingRecursion {
    static void merge(int arr[], int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = start;
        int j = mid + 1;

        // Merge the two halves
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        // Copy remaining elements from the right half
        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }

        // Copy the merged elements back into the original array
        for (int k = 0; k < temp.size(); k++) {
            arr[start + k] = temp.get(k);
        }
    }

    static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 9, 5, 6, 4, 2, 8};
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}