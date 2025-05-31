package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.*;
public class  TeamWonMatchAndToss{

    public void result(List<MatchesWithDeliveries> matches){

            Map<String, Integer> teamWonMap = new HashMap<>();

            matches.forEach(match->{
                
                if(match.getToss_winner().equals(match.getWinner())){
                    String team = match.getWinner();
                    if(!teamWonMap.containsKey(team)){
                        teamWonMap.put(team, 1);
                    }
                    else{
                        int value = teamWonMap.get(team);
                        teamWonMap.replace(team, value+1);
                    }
                }
            }
            );

            System.out.println("TeamWonMatchAndToss=> "+teamWonMap);

    }
}