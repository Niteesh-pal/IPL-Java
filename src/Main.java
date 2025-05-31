import java.util.ArrayList;
import java.util.List;
import util.*;
class Main{

    public static void main(String[] args){
      ReadCSVFile<Matches> match = new ReadCSVFile<>();
      ReadCSVFile<Deliveries> deliveries = new ReadCSVFile<>();

      List<Matches> matchesData = new ArrayList<>();
      List<Deliveries> deliveriesData = new ArrayList<>();


         matchesData = match.readcsvdata("./docs/matches.csv",rowData-> new Matches(
               Integer.parseInt(rowData[0]),
               Integer.parseInt(rowData[1]),
               rowData[2],
               rowData[3],
               rowData[4],
               rowData[5],
               rowData[6],
               rowData[7],
               rowData[8],
               Integer.parseInt(rowData[9]),
               rowData[10].equals("")?null:rowData[10],
               Integer.parseInt(rowData[11]),
               Integer.parseInt(rowData[12]),
               rowData[13],
               rowData[14],
               rowData[15],
               rowData[16],
               rowData.length>17?rowData[17]:null
            )
            );
       
       deliveriesData = deliveries.readcsvdata("./docs/deliveries.csv", rowData->new Deliveries(
        Integer.parseInt(rowData[0]),
        Integer.parseInt(rowData[1]),
        rowData[2],
        rowData[3],
        Integer.parseInt(rowData[4]),
        Integer.parseInt(rowData[5]),
        rowData[6],
        rowData[7],
        rowData[8],
        Integer.parseInt(rowData[9]),
        Integer.parseInt(rowData[10]),
        Integer.parseInt(rowData[11]),
        Integer.parseInt(rowData[12]),
        Integer.parseInt(rowData[13]),
        Integer.parseInt(rowData[14]),
        Integer.parseInt(rowData[15]),
        Integer.parseInt(rowData[16]),
        Integer.parseInt(rowData[17]),
        rowData[18].equals("") ? null:rowData[18],
        rowData[19].equals("")? null:rowData[19],
        rowData[20].equals("")? null:rowData[20]
       )
       );

      List<MatchesWithDeliveries> data = new CreateJson().create(matchesData, deliveriesData);
            // System.out.println("[");
            // data.forEach(item->{
            //     System.out.println("{");
            //     System.out.println("id =  "+ item.getId());
            //     System.out.println("season = "+ item.getSeason());
            //     System.out.println("Team1 = "+ item.getTeam1());
            //     System.out.println("Team2 = "+ item.getTeam2());
            //     System.out.print("Deliveries = [");
            //     System.out.println("{");
            //     item.getDeliveries().forEach(delivery->{
            //     System.out.println("match ID = "+ delivery.getMatch_id()+",");
            //     System.out.println("batting_team = "+ delivery.getBatting_team()+",");
            //     System.out.println("bowling_team = "+ delivery.getBowling_team()+",");
            //     System.out.println("over = "+delivery.getOver());
            //     System.out.println("ball = "+delivery.getBall()+",");
            //     });
            //     System.out.println("}");
            // });
            // System.out.println("]");

        // new MatchesPlayedPerYear().matches(matchesData);
        // System.out.println("-------------------------------------------------------------------");
        // new MatchesWonByTeams().wonByTeams(matchesData);
        // System.out.println("---------------------------------------------------------------------");
        // new ExtraRunsConcededPerTeam().extraRunsPerTeamInASeason(matchesData, deliveriesData);
        // System.out.println("-------------------------------------------------------------------");
        // new TopEconomicalBowlerInYear().economicalBowler(matchesData,deliveriesData,2015);

        
        
    }

   
}