package  problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.*;
public class MatchesWonByTeams{

    public void wonByTeams(List<Matches> matches){
        Map<String,Integer> team = new HashMap<>();

        for (Matches match : matches) {
            String winningTeam = match.getWinner();

            if(match.getResult().equals("no result")){
                continue;
            }

            
            if (!team.containsKey(winningTeam)) {
                team.put(winningTeam, 1);
            } else {
                int value = team.get(winningTeam);
                team.put(winningTeam, value+1);
            }
        }

        System.err.println("Won by Teams Per Year=> "+ team );
    }
}