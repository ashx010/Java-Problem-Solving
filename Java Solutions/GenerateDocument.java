import java.util.*;

class GenerateDocument {
    public boolean generateDocument(String characters, String document) {
        // Write your code here.
        Map<Character, Integer> mapC = new HashMap<>();
        Map<Character, Integer> mapD = new HashMap<>();

        int i=0;
        while(i<characters.length() || i<document.length()){
            if(i<characters.length()){
                mapC.merge(characters.charAt(i), 1, (o, n) -> o + 1);
            }
            if(i<document.length()){
                mapD.merge(document.charAt(i), 1, (o, n) -> o + 1);
            }
            i++;
        }

        for(Map.Entry<Character, Integer> entry : mapD.entrySet()){
            char a = entry.getKey();
            int b = entry.getValue();
            if(mapC.getOrDefault(a, 0) - b < 0){
                return false;
            }
        }
        return true;
    }

    public boolean generateDocument2(String characters, String document) {
        // Write your code here.
        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        while(i<characters.length() || i<document.length()){
            if(i<characters.length()){
                map.merge(characters.charAt(i), 1, (o, n) -> o + 1);
            }
            if(i<document.length()){
                map.merge(document.charAt(i), -1, (o, n) -> o - 1);
            }
            i++;
        }

        for(int j : map.values()){
            if(j<0){
                return false;
            }
        }
        return true;
    }
}
