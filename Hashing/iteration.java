import java.util.*;
public class iteration
{
    public static void iteration(String [] args)
        {
            HashMap<String, Integer> hm = new HashMap<>();
            hm.put("India", 150);  
            hm.put("China", 100);
            hm.put("USA", 75);
            hm.put("Nepal", 10);
            hm.put("UK", 90);
            System.out.println();

            //Iterate
            Set<String> keys = hm.keySet();
            System.out.println(keys);

            for(String k : keys) {
                System.out.println("Keys = " + k + ", value = " + hm.get(k));
            }
        }
}