public class powerofxn {
    public static int power(int x, int n){
    if(n==0){
        return 1;
    }
    if (x==0){
        return 0;
    }
   int powerm1=power(x, n-1);
   int powerm=x*powerm1;
   return powerm;
}

public static void main(String[] args) {
   int x=2; 
   int n=7;
   int ans=power(x, n);
   System.out.println(ans);

}
}