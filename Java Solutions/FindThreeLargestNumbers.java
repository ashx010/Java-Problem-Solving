import java.util.*;

class FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] ans = new int[3];
        Arrays.fill(ans, Integer.MIN_VALUE);
        for(int i : array){
            if(i >= ans[0]){
                if(i >= ans[1]){
                    if(i >= ans[2]){
                        ans[0] = ans[1];
                        ans[1] = ans[2];
                        ans[2] = i;
                    }else{
                        ans[0] = ans[1];
                        ans[1] = i;
                    }
                }else{
                    ans[0] = i;
                }
            }
        }
        return ans;
    }
}
