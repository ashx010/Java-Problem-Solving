import java.util.*;

class ValidSubsequence {
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        // Write your code here.
        int j=0;
        for(int i=0; i<array.size(); i++){
            if(j>=sequence.size()) break;
            if(array.get(i).equals(sequence.get(j))){
                j++;
            }
        }
        return j==sequence.size();
    }
}
