import java.util.*;

class Semordnilap {
    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        // Write your code here.
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            String rev = sb.reverse().toString();
            int j = i+1;
            while(j<words.length){
                if(words[j].equals(rev)){
                    ans.add(new ArrayList<>(List.of(words[i], words[j])));
                    break;
                }
                j++;
            }
        }
        return ans;
    }

    public ArrayList<ArrayList<String>> semordnilap2(String[] words) {
        // Write your code here.
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        Set<String> w = new HashSet<>();

        w.addAll(List.of(words));

        for(int i=0; i<words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);

            String rev = sb.reverse().toString();

            w.remove(words[i]);

            if(w.contains(rev) && (ans.size() < words.length/2)){
                ans.add(new ArrayList<>(List.of(words[i], rev)));
            }


        }
        return ans;
    }
}
