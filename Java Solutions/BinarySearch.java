import java.util.*;

class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        int f=0, l=array.length-1;
        while(f<=l){
            int m=f+(l-f)/2;
            if(array[m]==target){
                return m;
            }else if(array[m] < target){
                f=m+1;
            }else{
                l=m-1;
            }
        }
        return -1;
    }
}
