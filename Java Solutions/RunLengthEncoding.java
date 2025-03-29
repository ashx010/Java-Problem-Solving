import java.util.*;

class RunLengthEncoding {
    public String runLengthEncodingBruteForce(String string) {
        // Write your code here.
        StringBuilder ans = new StringBuilder();
        int b=0;

        for(int i=0; i<string.length(); i++){
            System.out.println(ans);
            if(i==0){
                ans.append("1");
                ans.append(string.charAt(i));
                b=1;
                continue;
            }
            if(ans.charAt(ans.length()-1) == string.charAt(i)){
                b++;
                System.out.println(b);
                if(b>=10){
                    ans.setCharAt(ans.length()-2, '9');
                    ans.append("1").append(string.charAt(i));
                    b=1;
                }else{
                    char c = (char) ('0' + b);
                    ans.setCharAt(ans.length()-2, c);
                }
            }else{
                ans.append("1");
                ans.append(string.charAt(i));
                b=1;
            }
        }
        return ans.toString();
    }

    public String runLengthEncodingMain(String string) {
        // Write your code here.
        StringBuilder ans = new StringBuilder();
        int b=1;

        for(int i=1; i<string.length(); i++){

            if(string.charAt(i) == string.charAt(i-1)){
                b++;
                if(b==10){
                    ans.append("9").append(string.charAt(i));
                    b=1;
                }
            }else{
                ans.append(b).append(string.charAt(i-1));
                b=1;
            }
        }
        ans.append(b).append(string.charAt(string.length()-1));
        return ans.toString();
    }
}
