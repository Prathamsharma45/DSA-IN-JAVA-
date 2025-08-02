public class sortarray {
    static boolean fn (int[]arr,int n){
      if(n==0||n==1){
        return true;
      }
    
    return arr[n-1]<=arr[n] &&  fn(arr,n-1);  
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(fn(arr, arr.length-1));
    }
}
