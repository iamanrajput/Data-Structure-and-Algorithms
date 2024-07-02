public class selectionsort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPostition = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPostition] > arr[j]) {
                    minPostition = j;
                }
            }
            //swap
            int temp = arr[minPostition];
            arr[minPostition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr (int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 5, 3};
        selectionSort(arr);
        printArr(arr);
    }
}
