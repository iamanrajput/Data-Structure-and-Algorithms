// public class stringcompression {

//     public static String compression (String str) {
//         String newStr = "";
//         for (int i = 0;i < str.length(); i++) {
//             Integer count = 1;
//             while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
//                 i++;
//                 count++;
//             }
//             newStr += str.charAt(i);
//             if (count > 1) {
//                 newStr += count.toString();
//             }
//         }
//         return newStr;

//     }
//     public static void main (String args[]) {
//         String str = "aaaabbbccccdd";
//         System.out.print(compression(str));
//     }
// }


//using StringBuilder
public class stringcompression {

    public static String compression (String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0;i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                i++;
                count++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();

    }
    public static void main (String args[]) {
        String str = "aaaabbbccccdd";
        System.out.print(compression(str));
    }
}
