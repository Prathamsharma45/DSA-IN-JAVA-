import java.util.HashMap;
import java.util.HashSet;

public class usinghashset {
    
    
    public static void subsequence(String str,int index,String newstring,HashSet<String> set){

        if(index==str.length()){
          if(set.contains(newstring)){
            return;
          }
          else{
            System.out.println(newstring);
            set.add(newstring);
            return;
          }
        }
        
        char currchar=str.charAt(index);
      subsequence(str, index+1, newstring+currchar,set);
        subsequence(str, index+1, newstring,set);
    }
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        String str="aaaa";
        subsequence(str, 0, "",set);
    }
}
