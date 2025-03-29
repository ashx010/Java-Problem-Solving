import java.util.*;

class InsertionSort {
    public static int[] insertionSort(int[] array) {
        // Write your code here.

        for(int i=1; i<array.length; i++){
            int c=array[i];
            int j=i-1;
            while(j>=0 && c<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = c;
        }

        return array;
    }
}
