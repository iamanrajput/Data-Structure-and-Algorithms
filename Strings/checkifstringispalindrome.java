public class checkifstringispalindrome {

    public static boolean isPalindrome (String word) {
        for (int i = 0; i < word.length()/2; i++) {
            // int n = word.length();
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]) {
        String word = "aman";
        System.out.print(isPalindrome(word));
    }
}
