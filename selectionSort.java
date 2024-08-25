public class selectionSort {
    public static void selection_sort(int [] arr , int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n ; j++) {
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,3,1,6,5};
        int n = arr.length;
        selection_sort(arr,n);
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
