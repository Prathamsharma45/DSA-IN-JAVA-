import java.util.HashMap;

public class string {
    public static void main(String[] args) {
        String input="programmingggg";
        HashMap<Character,Integer>map=new HashMap();

        for(char ch :input.toCharArray()){
            if(ch !=' '){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(map);

    }
}
