package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.Matches;
import util.Deliveries;

public  class ExtraRunsConcededPerTeam{


    public void extraRunsPerTeamInASeason(List<Matches> matchData, List<Deliveries> deliveryData){
        extraRunsPerTeamInASeason( matchData, deliveryData,2016);
    }

    public void extraRunsPerTeamInASeason(List<Matches> matchData, List<Deliveries> deliveryData,int customDate){
           Map<String, Integer> extraRuns = new HashMap<>();
           ArrayList<Integer> matches  = new  ArrayList<>();
        
        for (Matches match : matchData) {
             if(customDate == match.getSeason()){
                matches.add(match.getId());
             }
        }

        for (int matchId : matches) {
                for (Deliveries delivery : deliveryData) {
                        if(matchId == delivery.getMatch_id()){
                            String battingTeam = delivery.getBatting_team();
                            if(!extraRuns.containsKey(battingTeam)){
                                extraRuns.put(battingTeam, delivery.getExtra_runs());
                            }
                            else{
                                int value = delivery.getExtra_runs();
                                	extraRuns.replace(battingTeam, extraRuns.get(battingTeam)+value);
                            }


                        }
                }
        }

        System.out.println("extra Runs=> "+extraRuns);
    }

}