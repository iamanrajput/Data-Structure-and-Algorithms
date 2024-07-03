import java.util.*;

public class inputoutput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("Enter your name : ");
        a = sc.nextLine();
        System.out.print("Hello! " + a);

        sc.close();
    }
}
