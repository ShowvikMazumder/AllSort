public class QuickSort {
    int [] array;
    QuickSort(int[] array){
        this.array=array;
    }
    int partition(int low,int high,int[] array){
        int start=low;
        int end=high;
        int pivot=array[low];
        while (start<=end) {
            while (start<=end && array[start] <= pivot) {
                start++;
            }
            while (start<=end && array[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
            int temp=array[low];
            array[low]=array[end];
            array[end]=temp;

        return end;
    }
    int[] quickSort(int low, int high, int[] array){
        if (low<high) {
            int pivot=partition(low,high,array);
            quickSort(low, pivot - 1, array);
            quickSort(pivot + 1, high, array);
        }
        return array;
    }
    int [] quick(){
        int low=0;
        int high=array.length-1;
        return quickSort(low,high,array);
    }
}
