import java.util.*;

public class searchin2darray {
    public static boolean search(int matrix[][],int key) {
        for (int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Key found at (" + i + "," + j + ") th position" );
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int x = sc.nextInt();
        System.out.print("Enter the no of column : ");
        int y = sc.nextInt();

        int matrix[][] = new int[x][y];
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter elements for " + matrix[i][j] + "th postion : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println();
        }
        System.out.print("Enter the element you want to search for : ");
        int key = sc.nextInt();

        sc.close();
        search(matrix, key);
    }
}
