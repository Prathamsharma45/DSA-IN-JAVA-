public class ind1 {
   static void sum(int n){
    if(n>0){
        sum(--n);
        System.out.println(n);
        sum(--n);
    }
    
   }
   public static void main(String[] args) {
    sum(3);
   }
}
