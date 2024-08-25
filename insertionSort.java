public class insertionSort {
    public static void insertion_sort(int [] arr , int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){ 
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--; 
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,3,1,6,5};
        int n = arr.length;
        insertion_sort(arr,n);
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
