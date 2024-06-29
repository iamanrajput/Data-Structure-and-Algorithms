public class searchinsortedmatrix {

    public static boolean search(int matrix[][], int key) {
        int n = 0;
        int m = matrix[0].length - 1;

        while (n < matrix.length && m >=0) {
            if (matrix[n][m] == key) {
                System.out.print("Element found at (" + n + "," + m + ") th position");
                return true;
            }

            else if (matrix[n][m] > key) {
                m--;
            }
            else {
                n++;
            }
        }
        System.out.print("Key not found");
        return false; 
    }
    public static void main (String args[]) {
        int matrix[][] = {{10, 20, 30, 40,},
                          {15, 25, 35, 45,},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

        int key = 33;
        search(matrix, key);
    }
}
