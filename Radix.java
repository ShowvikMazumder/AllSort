import java.util.Arrays;

public class RadixSort {
    int[] array;
    RadixSort(int[] array){
        this.array=array;
    }
    int findMax(){
        int maximum=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>maximum) maximum=array[i];
        }
        return maximum;
    }
    void countSort(int pos){
        int []count_array=new int[10];
        int []another_array = new int[array.length];
        Arrays.fill(count_array,0);
        for(int i=0;i< array.length;i++) count_array[(array[i]/pos)%10]++;
        for(int i=1;i<count_array.length;i++) count_array[i]+=count_array[i-1];
        for(int i= array.length-1;i>=0;i--) another_array[--count_array[(array[i]/pos)%10]]=array[i];
        for(int i=0;i< array.length;i++) array[i]=another_array[i];
    }
    int[] radix(){
        int maxi=findMax();
        for(int pos=1;maxi/pos>0;pos=pos*10){
            countSort(pos);
        }
        return array;
    }
}
