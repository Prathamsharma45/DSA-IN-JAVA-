public class placetiles {
    public static int placetiles(int n,int m){
        if(n==m){
            return 2;
        }
     if(n<m){
        return 1;

     }  
        int vertical=placetiles(n-m, m) ;
        int horizontal=placetiles(n-1, m);
        return vertical+horizontal;
     }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(placetiles(n, m));


    }
}
