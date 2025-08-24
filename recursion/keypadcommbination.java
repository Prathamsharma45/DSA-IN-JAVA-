public class keypadcommbination {
    public static String []keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str,int index,String combination){
     
        if(index==str.length()){
            System.out.println(combination);
            return ;
        }
           char currchar=str.charAt(index);
           String maping=keypad[currchar-'0'];

           for(int i=0;i<maping.length();i++){
            printcomb(str, index+1, combination+maping.charAt(i));
           }

    }
    public static void main(String[] args) {
        String str="83";
        printcomb(str, 0, "");
    }
}
