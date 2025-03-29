import java.util.*;

class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] ans = new int[2];
        for(int i=0; i<array.length; i++){
            int y = targetSum - array[i];

        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        int[] ans = new int[2];
        int sum = 0;
        for(int i =0; i<array.length; i++){
            for( int j=0; j<array.length; j++){
                if(i!=j){
                    if(array[i] + array[j] == targetSum){
                        ans[0] = array[i];
                        ans[1] = array[j];
                        return ans;
                    }
                }
            }
        }
        return new int[0];
    }
}
