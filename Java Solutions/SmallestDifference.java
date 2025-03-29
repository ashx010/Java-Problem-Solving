import java.util.*;

class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int[] ans = new int[2];
        int c = Integer.MAX_VALUE;

        int x=0,y=0;
        while(x<arrayOne.length && y<arrayTwo.length){
            int abs = Math.abs(arrayOne[x] - arrayTwo[y]);
            if(abs == 0){
                ans[0] = arrayOne[x];
                ans[1] = arrayTwo[y];
                break;
            }
            if(abs < c){
                c = abs;
                ans[0] = arrayOne[x];
                ans[1] = arrayTwo[y];
            }
            if(arrayOne[x]<arrayTwo[y]){
                x++;
            }else{
                y++;
            }
        }

        return ans;
    }
}
