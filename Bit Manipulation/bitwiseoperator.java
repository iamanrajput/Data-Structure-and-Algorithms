public class bitwiseoperator {
    public static void main (String args[]) {
        System.out.println((5 & 6)); //Bitwise AND
        System.out.println((5 | 6)); //Bitwise OR
        System.out.println((5 ^ 6)); //Bitwise XOR
        System.out.println((~5)); //1's Complement
        System.out.println((5<<2)); //Right Shift Operator
        System.out.println((5>>2)); //Left Shift Operator

    }
}

//Bitwise AND
/*
 * 0 & 0 - 0
 * 0 & 1 - 0
 * 1 & 0 - 0
 * 1 & 1 - 1 
 */

 //Bitwise OR
 /*
 * 0 | 0 - 0
 * 0 | 1 - 1
 * 1 | 0 - 1
 * 1 | 1 - 1 
 */

 //Bitwise XOR
  /*
 * 0 ^ 0 - 0
 * 0 ^ 1 - 1
 * 1 ^ 0 - 1
 * 1 ^ 1 - 0
 */

//1's Complement
  /*
 * ~0 - 1
 * ~1 - 0
 */

//Left Shift Operator
/*
 * a << b = a * 2^b 
 * 5 << 2
 * 000101 first two digits will be removed and will add two zero at the end
 */

//Right Shift Operator
/*
 * a << b = a / 2^b 
 * 5 << 2
 * 000101 last two digits will be removed and will add two zero in the start
 */
