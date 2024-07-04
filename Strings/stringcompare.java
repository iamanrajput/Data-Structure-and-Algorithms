public class stringcompare {
    public static void main (String args[]) {
        String s1= "AmanRajput";
        String s2= new String("AmanRajput");

        if (s1 == s2) {
            System.out.print("Strings are equal");
        }
        //it will not print Strings are equal as in java new string is not same with normal string declaration

        else if (s1.equals(s2)) {
            System.out.print("Strings are equal with 2nd if statement");
        }
    }
}
