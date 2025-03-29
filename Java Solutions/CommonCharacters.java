import java.util.*;

class CommonCharacters {
    public String[] commonCharacters(String[] strings) {
        // Write your code here.
        ArrayList<String> com = new ArrayList<>(List.of(strings[0].split("")));

        for(int i=1; i<strings.length; i++){
            int j =0;
            while(j<com.size()){
                if(strings[i].indexOf(com.get(j)) == -1){
                    com.remove(j);
                }else{
                    j++;
                }
            }
        }
        Set<String> ans = new HashSet<>(com);
        return ans.toArray(new String[ans.size()]);
    }
}
