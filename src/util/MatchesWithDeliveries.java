
package  util;

import java.util.ArrayList;
import java.util.List;

public class  MatchesWithDeliveries extends Matches{

   List<Deliveries> deliveries = new ArrayList<>();

    public MatchesWithDeliveries(Matches match, List<Deliveries> Deliveries) {
        super(match.getId(), match.getSeason(), match.getCity(), match.getDate(), match.getTeam1(), match.getTeam2(), match.getToss_winner(), match.getToss_decision(), match.getResult(),match.getDl_applied(), match.getWinner(), match.getWin_by_runs(), match.getWin_by_wickets(), match.getPlayer_of_match(), match.getVenue(), match.getUmpire1(), match.getUmpire2(), match.getUmpire3());
        this.deliveries = Deliveries;
    }

    public List<Deliveries> getDeliveries(){
        return deliveries;
    }

    
}