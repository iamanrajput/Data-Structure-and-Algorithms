public class charatmethod {

    public static void charAt (String str) {
        for (int i = 0; i <str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main (String args[]) {
        String fullname = "Aman Rajput";
        charAt(fullname);
    }
}
