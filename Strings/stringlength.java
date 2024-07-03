import java.util.*;

public class stringlength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("Enter something : ");
        a = sc.nextLine();
        int b = a.length(); //same as (arr.length) we just have to add a parenthesis
        System.out.print("Length of this text is : " + b);

        sc.close();
    }
}
