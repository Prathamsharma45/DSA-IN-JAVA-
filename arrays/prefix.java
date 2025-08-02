public class prefix {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8};
        int[] prefixsum=new int[nums.length];
        prefixsum[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            prefixsum[i]=nums[i-1]+nums[i];

        }
        for(int X:prefixsum)
        {
            System.out.println(X);
        }

    }
}
