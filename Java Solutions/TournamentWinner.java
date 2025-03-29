import java.util.*;

class TournamentWinner {
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {
        // Write your code here.
        HashMap<String, Integer> map = new HashMap<>();
        String winTeam = "";
        int maxVal = 0;
        for(int i=0; i<competitions.size(); i++){
            int t = 0;
            if(results.get(i) == 0){
                t=1;
            }else{
                t=0;
            }
            map.merge(competitions.get(i).get(t), 3, (o, n) -> o + n);
            if(map.get(competitions.get(i).get(t)) > maxVal){
                maxVal = map.get(competitions.get(i).get(t));
                winTeam = competitions.get(i).get(t);
            }
        }

        return winTeam;
    }
}
