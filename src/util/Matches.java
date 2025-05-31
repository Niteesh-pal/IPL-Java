package  util;

public class Matches{

    private final int id;
    private final int season;
    private final String city;
    private final String date;
    private final String team1;
    private final String team2;
    private final String toss_winner;
    private final String toss_decision;
    private final String result;
    private final int dl_applied;
    private final String winner;
    private final int win_by_runs;
    private final int win_by_wickets;
    private final String player_of_match;
    private final String venue;
    private final String umpire1;
    private final String umpire2;
    private final String umpire3;

    public Matches(int id, int season, String city, String date, String team1, String team2, String toss_winner, String toss_decision, String result, int dl_applied, String winner, int win_by_runs, int win_by_wickets, String player_of_match, String venue, String umpire1, String umpire2, String umpire3) {
        this.id = id;
        this.season = season;
        this.city = city;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.toss_winner = toss_winner;
        this.toss_decision = toss_decision;
        this.result = result;
        this.dl_applied = dl_applied;
        this.winner = winner;
        this.win_by_runs = win_by_runs;
        this.win_by_wickets = win_by_wickets;
        this.player_of_match = player_of_match;
        this.venue = venue;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
        this.umpire3 = umpire3;
    }

    public int getId() {
        return this.id;
    }

    public int getSeason() {
        return this.season;
    }

    public String getCity() {
        return this.city;
    }

    public String getDate() {
        return this.date;
    }

    public String getTeam1() {
        return this.team1;
    }

    public String getTeam2() {
        return this.team2;
    }

    public String getToss_winner() {
        return this.toss_winner;
    }

    public String getToss_decision() {
        return this.toss_decision;
    }

    public String getResult() {
        return this.result;
    }

    public int getDl_applied() {
        return this.dl_applied;
    }

    public String getWinner() {
        return this.winner;
    }

    public int getWin_by_runs() {
        return this.win_by_runs;
    }

    public int getWin_by_wickets() {
        return this.win_by_wickets;
    }

    public String getPlayer_of_match() {
        return this.player_of_match;
    }

    public String getVenue() {
        return this.venue;
    }

    public String getUmpire1() {
        return this.umpire1;
    }

    public String getUmpire2() {
        return this.umpire2;
    }

    public String getUmpire3() {
        return this.umpire3;
    }

    public Matches getAllRecords(){
        return this;
    }
    
}