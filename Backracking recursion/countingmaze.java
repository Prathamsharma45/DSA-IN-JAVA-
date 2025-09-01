import java.util.ArrayList;

public class countingmaze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        System.out.println(path("", 3, 3));
        System.out.println(pathDiagonal("",3,3));
       
    }
    public static int count(int row, int col){
        if(row==1||col==1){
            return 1;
        }
        int right=count(row-1,col);
        int left=count(row,col-1);
        return right+left;
        
    }
     public static ArrayList<String> path(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);

            return list;            
        }
        ArrayList<String>list=new ArrayList<>();
        if(row>1){
            list.addAll(path(p+"D" ,row-1, col));
        }
        if(col>1){
            list.addAll(path(p+"R", row, col-1));
        }
        return list;
    }
      public static ArrayList<String> pathDiagonal(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);

            return list;            
        }
        ArrayList<String>list=new ArrayList<>();
        if(row>1 && col>1){
            list.addAll(pathDiagonal(p+"D",row-1,col-1));
        }
        if(row>1){
            list.addAll(pathDiagonal(p+"V" ,row-1, col));
        }
        if(col>1){
            list.addAll(pathDiagonal(p+"R", row, col-1));
        }
        return list;
    }
    
}
