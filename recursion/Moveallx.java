public class Moveallx {
    public static void moveallX(String str,int count,int index,String newstring){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newstring+='x';
            }
                
            
            System.out.println(newstring);
            return;
        }
      
      char  currchar=str.charAt(index);
      if(currchar=='x'){
        count++;
        moveallX(str, count, index+1, newstring);
      }
      else
      {
        newstring+=currchar;
        moveallX(str, count, index+1, newstring);
      }
    }
    public static void main(String[] args) {
        String str="abcxghxxkk";
        moveallX(str, 0, 0, "");
    }
    
}
