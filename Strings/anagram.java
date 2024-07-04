import java.util.Arrays;

public class anagram {

    public static boolean isAnagram (String a,String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] aArray = a.toCharArray(); 
        char[] bArray = b.toCharArray(); 

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        return Arrays.equals(aArray, bArray);
    }
    public static void main (String args[]) {
        String a = "night";
        String b = "thing";
        System.out.print(isAnagram(a, b));
    }
}
