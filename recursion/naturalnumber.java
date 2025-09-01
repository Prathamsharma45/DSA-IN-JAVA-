import java.util.ArrayList;
import java. util.*;

public class naturalnumber {
    public static void printsubset(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.println(subset.get(i)+"");
        }
        System.out.println();
    }
    public static void printnatural(int n,ArrayList<Integer>subset){
        if(n==0){
            printsubset(subset);
            return ;
        }
        subset.add(n);
        printnatural(n-1, subset);
        subset.remove(subset.size()-1);
        printnatural(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer>subset=new ArrayList<>();
        printnatural(n,subset);

    }
}
