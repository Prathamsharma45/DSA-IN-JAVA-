class index{
    static void sum(int a){
        if(a<0){
        return ;//smaller to greater value
    }
    sum(a-1);
    
    System.out.println(a);
}
static void fun(int n){
    if(n==0){   //greater to smaller value
        return;

    }
    System.out.println(n);
    fun(n-1);
}
    public static void main(String[] args) {
        sum(5);
        System.out.println();
        fun(6);
    }
}