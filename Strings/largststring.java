public class largststring {
    public static void main (String args[]) {
        String name[] = {"apple", "mango", "banana"};
        String largest = name[0];
        for (int i = 1; i <name.length; i++) {
            if (largest.compareTo(name[i]) < 0) {
                largest = name[i];
            }
        }
        System.out.print(largest);
    }
}
