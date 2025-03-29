import java.util.*;

class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] newAr = new int[array.length];
        for(int i=0; i<array.length; i++){
            newAr[i] = array[i] * array[i];
        }
        Arrays.sort(newAr);

        return newAr;
    }

    public int[] sortedSquaredArray2(int[] array) {
        // Write your code here.
        int[] newAr = new int[array.length];

        int s = 0;
        int l = array.length-1;

        for(int i = array.length-1; i>=0; i--){
            if(Math.abs(array[s]) <= Math.abs(array[l])){
                newAr[i] = array[l]*array[l];
                l--;
            }else{
                newAr[i] = array[s] * array[s];
                s++;
            }
        }

        return newAr;
    }
}
