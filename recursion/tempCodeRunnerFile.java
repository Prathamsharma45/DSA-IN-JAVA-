public static void subsequence(String str,int index,String newstring){

        if(index==str.length()){
            System.out.println(newstring);
            return;
        }
        
        char currchar=str.charAt(index);
      subsequence(str, index+1, newstring+currchar);
        subsequence(str, index+1, newstring);
    }
    public static void main(String[] args) {
        String str="abcd";
        subsequence(str, 0, "");
    }