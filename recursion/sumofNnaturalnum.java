public class sumofNnaturalnum {
    public static void naturalnumber(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
           System.out.println(sum);
           return ;
        }
        sum=sum+i;
       naturalnumber(i+1, n, sum);
       System.out.println(i);
    }
        public static void main(String[] args) {
         
            naturalnumber(1, 05, 0);
           
      
    }
    
}
