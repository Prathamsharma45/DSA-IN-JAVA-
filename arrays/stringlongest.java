import java.util.HashMap;

class Solutio {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, i = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(i, map.get(ch) + 1);
            }
            map.put(ch, j);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new Solutio().lengthOfLongestSubstring(s));
    }
}
