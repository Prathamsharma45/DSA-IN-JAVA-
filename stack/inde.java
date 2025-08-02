
public class inde {
    public static void main(String[] args) {
        int[] arr = {8, 1, 0, 3, 0, 7};
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    newarr[i]=arr[j];
                    count++;
                    break;
                }
            }
            if(count!=1){
                newarr[i]=-1;
            }
        }

        for(int i : newarr){
            System.out.println(i  );
        }
    }
}
