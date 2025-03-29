import java.util.*;

class SelectionSort {
    public static int[] selectionSort(int[] array) {
        // Write your code here.
        for(int i=0; i<array.length; i++){
            int mi = i;
            for(int j=i+1; j < array.length; j++){
                if(array[mi] > array[j]){
                    mi=j;
                }
            }
            int temp = array[mi];
            array[mi] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
