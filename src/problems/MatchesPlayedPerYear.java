package problems;

import java.util.HashMap;
import util.Matches;
import java.util.List;
import java.util.Map;

 public  class MatchesPlayedPerYear{

    public void matches(List<Matches> matches){
        Map<Integer, Integer> seasonsMap = new HashMap<>();

            for (Matches match : matches) {
                int season = match.getSeason();
                if(!seasonsMap.containsKey(season)){
                    seasonsMap.put(season,1);
                }
                else{
                    int values = seasonsMap.get(season);
                    seasonsMap.put(season, values+1);
                }
            }

            System.err.println("season match"+ seasonsMap);
    }
}