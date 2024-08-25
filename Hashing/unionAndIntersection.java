import java.util.*;
public class unionAndIntersection
{
    public static void main(String [] args)
        {
            int[] arr1 = {1, 5, 7, 6, 3};
            int[] arr2 = {7, 8, 4, 9};

            HashSet <Integer> set = new HashSet<>();

            //union code start
            for (int i = 0; i < arr1.length; i++) {
                set.add(arr1[i]);
            }
            for (int i = 0 ; i < arr2.length; i++) {
                set.add(arr2[i]);
            }

            System.out.println("Union = " + set.size());
            //union code end

            set.clear();

            //intersection code start
            for (int i = 0; i < arr1.length; i++) {
                set.add(arr1[i]);
            }

            int count = 0;
            for(int i = 0; i < arr2.length; i++) {
                if (set.contains(arr2[i])) {
                    count++;
                    set.remove(arr2[i]);
                }
            }
            System.out.print("Intersection = " + set.size());
        }
}