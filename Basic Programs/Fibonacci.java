/*
 The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, 
 usually starting with 0 and 1.

The sequence goes:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Formula:

F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2) for n > 1
Each number in the series is called a Fibonacci number.
 */

import java.util.*;
public class Fibonacci
{

    public static int fib (int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String [] args)
        {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter number = ");
            int n = sc.nextInt();
            System.out.println(fib(n));
        }
}