import java.util.*;

class FirstNonRepeatingCharacter {
    public int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<string.length(); i++){
            map.merge(string.charAt(i), 1, (o,n) -> o+1);
        }
        for(int j=0; j<string.length(); j++){
            if(map.get(string.charAt(j)) == 1){
                return j;
            }
        }
        return -1;
    }
}
