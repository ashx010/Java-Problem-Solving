import java.util.*;

class IsPalindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
