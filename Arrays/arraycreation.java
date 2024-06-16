import java.util.*;

public class arraycreation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter a number : ");
            arr[i]=sc.nextInt(); 
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println("Numbers are " + arr[i]);
        }
    }
}