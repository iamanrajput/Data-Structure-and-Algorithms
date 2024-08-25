import java.util.*;
public class treeSet
{
    public static void main(String [] args)
        {
            TreeSet<String> ts = new TreeSet<>();
            ts.add("Delhi");
            ts.add("Mumbai");
            ts.add("Manali");
            ts.add("Shimla");
            ts.add("Kullu");
            System.out.println(ts);
        }
}
// Sorted in ascending order
// NULL values is not allowed 
// Time Complexity = O(log n)