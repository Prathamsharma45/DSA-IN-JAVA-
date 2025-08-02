public class twoadd {
    public static void main(String[] args) {
        int arr[]={2,7,9,0,5};
        int temp=0;
        int target=9;
        for (int i = 0; i < arr.length; i++) {
            temp=target-arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==temp){
                    System.out.println("the sum of two array is :-");
                    System.out.println(arr[i]+arr[j]);
                }
                break;
            }

        }
    }
}

