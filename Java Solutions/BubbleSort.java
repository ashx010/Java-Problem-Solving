import java.util.*;

class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    array[j] = array[j+1] + array[j];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                }
            }
        }
        return array;
    }
}
