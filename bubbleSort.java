public class bubbleSort{
    public static void bubble_sort(int [] arr , int n) {
        for (int i = 0; i < n - 1; i++) {
            //Optimize Code When Array Are Sorted
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) return;
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,3,1,6,5};
        int n = arr.length;
        bubble_sort(arr,n);
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

