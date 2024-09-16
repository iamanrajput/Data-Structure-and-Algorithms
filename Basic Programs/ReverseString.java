/*
To reverse a string

 * We use StringBuilder to reverse a string in Java because it provides a built-in method, .reverse(), 
 * which efficiently reverses the sequence of characters. 
 * This method is optimized for performance, and StringBuilder is mutable, 
 * meaning it can modify the string in place without creating multiple copies of the string,
 * unlike String which is immutable.
 * 
 * Then, We use toString() to convert a StringBuilder (or other objects) back into a String.
 * We use .toLowerCase() to convert a string to all lowercase characters
 */


public class ReverseString
{
    public static void main(String [] args)
        {
            String str = "University";
            StringBuilder reverse = new StringBuilder(str).reverse();   
            System.out.println(reverse.toString().toLowerCase());
        }
}

