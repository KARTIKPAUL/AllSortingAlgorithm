public class mergeSort {
    public static void dispalyArray(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge(int [] arr, int l ,int mid , int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left [] = new int[n1];
        int right [] = new int[n2];

        int i, j, k;
        for(i = 0; i < n1; i++) left[i] = arr[l+i];
        for(j = 0; j < n2; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) { 
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while (i < n1){ 
            arr[k++] = left[i++];
        }
        while (j < n2){ 
            arr[k++] = right[j++];
        }
        
    }

    public static void merge_sort(int [] arr, int l , int r){
        if (l >= r) return;
        int mid = (l + r) / 2;
        merge_sort(arr, l, mid);
        merge_sort(arr, mid + 1, r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int arr [] = {2,3,1,6,5};
        int n = arr.length;
        System.out.println("Array Before Sorting" + ' ');
        dispalyArray(arr);
        System.out.println();
        System.out.println("Array Before Sorting" + ' ');
        merge_sort(arr,0,n-1);
        dispalyArray(arr);
        
        
    }
}
