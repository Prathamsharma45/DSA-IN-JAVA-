import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Nqueen{
    private int n;
    private List<List<String>> solutions;
     private int []board;
     private boolean[]cols;
     private boolean[]diag1;
     private boolean[]diag2;

     public Nqueen(int n){
        this.n=n;
        this.solutions=new ArrayList<>();
        this.board=new int[n];
        Arrays.fill(this.board, -1);
        this.cols = new boolean[n];
       this.diag1 = new boolean[2 * n - 1];       
         this.diag2 = new boolean[2 * n - 1];
     }
     public List <List<String>> solve()<>{
        bactrack(0);
        return solutions;
     }
     public void backtrack(int row){
        if(row==n){
            solutions.add(render board());
            return;
        }
        for(int col=0;col<n;col++){
            int d1=row-col(n-1);
            int d2=row+col;
            if(cols[col]||diag1[d1]||diag2[d2])continue;
            board[row]=col;
            cols[col]=diag1[d1]=diag2[d2]=true;
            backtrack[e]

        }
     }


     }

