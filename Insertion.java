public class InsertionSort {
    int [] array;
    InsertionSort(int[] array){
        this.array=array;
    }
    int[] insertion(){
        for(int i=1;i< array.length;i++){
            int j=i-1;
            while (j>=0 && array[j]>array[j+1]){
                int temp=array[j];
                array[j+1]=array[j];
                array[j]=temp;
                j--;
            }
        }
        return array;
    }
}
