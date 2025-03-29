import java.util.*;

class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        int a =0;
        Arrays.sort(coins);
        for(int i : coins){
            if(i > a+1){
                return a+1;
            }else{
                a=a+i;
            }
        }
        return a+1;
    }
}
