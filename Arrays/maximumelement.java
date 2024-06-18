import java.util.*;

public class maximumelement {

    public static int maxElement (int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main (String [] args) {
        int arr[] = {5, 3, 7, 9, 1};
        int max = maxElement(arr);
        System.out.print(max);
    }
}