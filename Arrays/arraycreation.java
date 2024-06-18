import java.util.*;

public class array1 {
    public static void main ( String [] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.print("Total array element : ");
        int n = sc.nextInt();

        int arr[] = new int [n];

        for ( int i = 0; i < arr.length ; i++){
            System.out.print("Enter elements : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println("Elements are : " + arr[i] );
        }

        sc.close();
    }
}
