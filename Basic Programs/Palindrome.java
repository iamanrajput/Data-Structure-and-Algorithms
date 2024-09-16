/*
 * A palindrome is a word, phrase, number, or sequence of characters that reads the same forward and backward, 
 * ignoring spaces, punctuation, and capitalization.
 * eg. madam
 * Brute Force Approach:
    Step 1: Reverse the given string.
    Step 2: Compare the original string with the reversed string.
    Step 3: If both strings are identical, the input string is a palindrome; otherwise, it’s not.
 * Optimized Approach (Two-Pointer Technique):
 */

//Brute Force Approach
/*

public class Palindrome
{
    public static void main(String [] args)
        {
            String str = "Madam";
            StringBuilder reverse = new StringBuilder(str).reverse();
            System.out.println(str.equals(reverse));
        }
}
*/
//Two Pointer Approach
public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true; 
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false; 
                break; 
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

