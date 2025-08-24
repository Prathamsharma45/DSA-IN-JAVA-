public class removeduplicate {
  

    public static void removeDuplicate(String str, int index, String newString, boolean[] map) {
        // Base case: if index reaches the end of the string
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        if (map[currChar - 'a']) {
            // If character is already present in newString
            removeDuplicate(str, index + 1, newString, map);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, index + 1, newString, map);
        }
    }

    public static void main(String[] args) {
        String str = "pprraatthhaamm";
        boolean[] map = new boolean[26]; // Assuming only lowercase letters
        removeDuplicate(str, 0, "", map);
    }
}


