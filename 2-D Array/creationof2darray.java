import java.util.*;

public class creationof2darray {
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
        sc.close();
    }
}
