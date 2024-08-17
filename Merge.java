public class MergeSort {
    int [] array;
    MergeSort(int[] array){
        this.array=array;
    }
    void merge(int low, int high, int mid, int[] array){
        int n1= mid-low+1;
        int n2=high-mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        for(int i=0;i<n1;i++) leftArray[i]=array[low+i];
        for(int j=0;j<n2;j++) rightArray[j]=array[mid+1+j];
        
        int i=0;
        int j=0;
        int k=low;
        while(i<leftArray.length && j< rightArray.length){
            if(leftArray[i]<=rightArray[j]) array[k++]=leftArray[i++];
            else array[k++]=rightArray[j++];
        }
        while(i< leftArray.length) array[k++]=leftArray[i++];
        while(j< rightArray.length) array[k++]=rightArray[j++];
        
    }
    int[] mergeSort(int low, int high, int[] array){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(low,mid,array);
            mergeSort(mid+1,high,array);
            merge(low,high,mid,array);
        }
        return array;
    }
    int[] merg(){
        int low=0;
        int high= array.length-1;
        return mergeSort(low,high,array);
    }
}
