import java.util.*;

class CaesarCypherEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            int a = ((c + key - 'a' + 26) % 26) + 'a';
            ans.append((char) a);
        }
        return ans.toString();
    }
}
