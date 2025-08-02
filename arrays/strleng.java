import java.util.HashMap;

public class strleng {
    public static void main(String[] args) {
       String str="aaaabbbcccaaabbb" ;
        HashMap<Object, Object> map = new HashMap<>();
        int[]count=new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            count[ch-"a"]++;

            for (int j = 0; j < str.length(); j++) {

            }
        }


    }
    }

