public class produc {
    public static int product1(int n) {
        if (n%10==n)
            return n;
     
            return (n%10)*product1(n/10);
    }
    public static int sum(int n){
           if (n==0)
            return 0;
     
            return (n%10)+sum(n/10);
    }


    public static void main(String[] args) {
   
       int ans =product1(1523);
  
       System.out.println("The product of a number"+ans);
       int sum1=sum(4552);
            System.out.println("The sum of the Number"+sum1);
    }
}
