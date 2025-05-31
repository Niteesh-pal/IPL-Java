package  util;

import java.util.ArrayList;
import java.util.List;

public class CreateJson{
    public List<MatchesWithDeliveries> create(List<Matches> matchesdata, List<Deliveries> deliveriesData){
        List<MatchesWithDeliveries> jsonData  = new ArrayList<>();

        for (Matches match : matchesdata) {

                List<Deliveries> deliveryList = new ArrayList<>();
                int id = match.getId();

                for (Deliveries delivery : deliveriesData) {
                    
                    if( id == delivery.getMatch_id()){
                        deliveryList.add(delivery);
                    }
                }

                MatchesWithDeliveries obj = new MatchesWithDeliveries(match, deliveryList);

                jsonData.add(obj);
        }


       return jsonData;


    }
}