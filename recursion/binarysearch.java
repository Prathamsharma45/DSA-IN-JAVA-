class binarysearch{
    static int binarySearch(int []arr,int start,int end, int key){
      
        
            int mid =( start + end  ) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key<arr[mid]) {
             return binarySearch(arr,mid-1, end, key);
            } else {
            return binarySearch(arr,mid+1, start, key);
            }
    
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 25, 26, 78};
           int data=binarySearch(arr, 0, 0, 26);
           System.out.println(data);
    }
}