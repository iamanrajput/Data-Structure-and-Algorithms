import java.util.*;
public class validAnagram
{
    public static boolean isAnagram (String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch , 1);
                }
        }
        for (int i = 0; i<s.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
                }

        }
        return map.isEmpty();
    }
    public static void main(String [] args)
        {
            String s = "race";
            String d = "care";
            System.out.print(isAnagram(s, d));
        }
}