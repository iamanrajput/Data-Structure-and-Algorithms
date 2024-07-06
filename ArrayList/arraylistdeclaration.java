import java.util.*;

public class arraylistdeclaration {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //add element
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        //get element
        int a = list.get(2);
        System.out.println(a);

        //remove element
        list.remove(3);
        System.out.println(list);

        //set element at index
        list.set(2, 25);
        System.out.println(list);

        System.out.println(list.contains(10));
        System.out.println(list.contains(35));

        //size of arraylist
        System.out.println(list);
        int b= list.size();
        System.out.println(b);

        //loop
        for (int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}