package  problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.Deliveries;
import util.Matches;


class  MatchObj {
    int toal_runs;
    int total_overs;
    int result;  
    ArrayList<Integer> overs = new ArrayList<>(); 

        public MatchObj(int toal_runs, int total_overs) {
            this.toal_runs = toal_runs;
            this.total_overs = 1;
            this.result = toal_runs/total_overs;
            this.overs.add(total_overs);
        }
        public int getRuns(){
            return  this.toal_runs;
        }

        public int getOvers(){
            return  this.total_overs;
        }
        
        public int getResut(){
            return  this.result;
        }

        public void setTotal_runs(int run){
            toal_runs += run;

            setResult();
        }
        public void setOvers( int over){
            if(!this.overs.contains(over)){
                this.total_overs++;
                this.overs.add(over);
                setResult();
            }
        }

        public void setResult(){
            this.result = this.toal_runs / this.total_overs;
        }

     
    }
public class TopEconomicalBowlerInYear{

    public void economicalBowler(List<Matches> matchesData, List<Deliveries> deliveryData, int customYear)
    {
        ArrayList<Integer> matchId = new ArrayList<>();
        Map<String, MatchObj> economicalBowler = new HashMap<>();
    //geting match id
        for (Matches match  : matchesData) {
            if(match.getSeason() ==  customYear){
                matchId.add(match.getId());
            }
        }
    
    for (int id  : matchId) {
        for(Deliveries delivery : deliveryData){
            if(delivery.getMatch_id() == id){
                String bowler = delivery.getBowler();
                int over = delivery.getOver();
                int total_run = delivery.getTotal_runs();


                if(!economicalBowler.containsKey(bowler)){
                        MatchObj data = new MatchObj(total_run, over);
                        economicalBowler.put(bowler, data);
                }
                else{
                    MatchObj data = economicalBowler.get(bowler);
                    data.setOvers(over);
                    data.setTotal_runs(total_run);
                }
            }
        }
    }

    String topEconomicalBowler = null;
    int result =0;
    for (String bowler : economicalBowler.keySet()) {
        if(topEconomicalBowler == null){
            topEconomicalBowler = bowler;
            result =economicalBowler.get(bowler).getResut();
        }
        else{
            if(economicalBowler.get(bowler).getResut() < result){
                topEconomicalBowler = bowler;
                result=economicalBowler.get(bowler).getResut();
            }
        }
    }
    
    System.out.println("TopEconomicalBowler=> "+ " Bowler = "+topEconomicalBowler+" ,Rate = "+ result);
    }

}