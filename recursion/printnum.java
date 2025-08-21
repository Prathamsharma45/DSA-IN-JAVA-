public class printnum {
    static void printnumber(int n){
        if(n==0){
            return;//5to1
        }
        System.out.println(n);
        printnumber(n-1);
    }
        static void printnumb(int x){
        if(x==6){//1to 5
            return;
        }
        System.out.println(x);
        printnumb(x+1);
    }
    public static void main(String[] args) {
        int n=5;

        printnumber(n);
        System.out.println();
                int x=1;
        printnumb(x);
    }
}
