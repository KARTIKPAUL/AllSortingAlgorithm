public class quickSort {

    public static void displayArray(int arr []) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int [] arr , int i , int j) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }

    public static int partition(int arr [] , int st , int end) {
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1; i <= end ; i++) {
            if(arr[i] <= pivot) count++;
        }
        int pivotIndex = st + count;
        swap(arr, st , pivotIndex);
        int i = st;
        int j = end;

        while (i < pivotIndex && j > pivotIndex) { 
                while (arr[i] <= pivot) i++;
                while (arr[j] > pivot) j--;
                while (i < pivotIndex && j > pivotIndex) { 
                    swap(arr, i, j);
                    i++;
                    j--;
                }
        }


        return pivotIndex;
    }
    public static void quick_sort(int arr [] , int st , int end) {
        if(st >= end) return;
        int pi = partition(arr, st, end);
        quick_sort(arr, st , pi-1 );
        quick_sort(arr, pi+1 , end);
    }
    public static void main(String[] args) {
        int arr [] = {2,3,1,6,6,5,5};
        int n = arr.length;
        System.out.println("Array Before Sorting" + ' ');
        displayArray(arr);
        System.out.println();
        System.out.println("Array Before Sorting" + ' ');
        quick_sort(arr,0,n-1);
        displayArray(arr);
        
    }
}