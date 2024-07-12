public class evenodd {
    public static void oddEven(int n) {
        int sample = 1;
        if((n & sample) == 0) {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        } 
    }
    public static void main (String args[]) {
        oddEven(4);
        oddEven(15);
        oddEven(404);
    }
}
