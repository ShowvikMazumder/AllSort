public class SelectionSort {
    int [] array;
    SelectionSort(int[] array){
        this.array=array;
    }
    int[] selection(){

        for(int i=array.length-1;i>=0;i--){
            int max=i;
            for(int j=i-1;j>=0;j--){
                if(array[j]>array[max]) max=j;
            }
            if(max!=i){
                int temp=array[max];
                array[max]=array[i];
                array[i]=temp;
            }
        }
        return array;
    }
}
