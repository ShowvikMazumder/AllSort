import java.util.Arrays;

public class CountingSort {
    int[] array;
    CountingSort(int[] array){
        this.array=array;
    }
    int maxi(){
        int maximum=array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]>maximum) maximum=array[i];
        }
        return maximum;
    }
    int[] count(){
        int k=maxi();
        int[] count_array= new int[k+1];
        int[] another_array=new int[array.length];
        Arrays.fill(count_array,0);
        for(int i=0;i<array.length;i++) count_array[array[i]]++;
        for(int i=1;i<count_array.length;i++) count_array[i]+=count_array[i-1];
        for(int i=array.length-1;i>=0;i--) another_array[--count_array[array[i]]]=array[i];
        for(int i=0;i< array.length;i++)array[i]=another_array[i];
        return array;
    }
}
