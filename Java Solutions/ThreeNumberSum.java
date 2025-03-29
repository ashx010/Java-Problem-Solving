import java.util.*;

class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> ans = new ArrayList<>();

        Arrays.sort(array);

        for(int c=0; c<array.length; c++){
            int l = c+1;
            int r = array.length-1;
            while(l < r){
                int sum = array[c] + array[l] + array[r];
                if(sum == targetSum){
                    Integer[] res = {array[c], array[l], array[r]};
                    Arrays.sort(res);
                    ans.add(res);
                    l++;
                    r--;
                }else if(sum < targetSum){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return ans;
    }
    public static List<Integer[]> threeNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                int z = targetSum - (array[i] + array[j]);

                int search = Arrays.binarySearch(array, z);

                if(search >= 0 && search != i && search != j){
                    Integer[] res = {array[i], array[j], z};

                    Arrays.sort(res);

                    String keyR = res[0] + " " + res[1] + " " + res[2];
                    if(!set.contains(keyR)){
                        ans.add(res);
                        set.add(keyR);
                    }
                }
            }
        }
        return ans;
    }
}
