package util;

public  class Deliveries{

   private final  int  match_id;
   private final int  inning;
   private final String  batting_team;
   private final String  bowling_team;
   private final int  over;
   private final int  ball;
   private final String batsman;
   private final String non_striker;
   private final String bowler;
   private final int	is_super_over;
   private final int	wide_runs;
   private final int	bye_runs;
   private final int	legbye_runs;
   private final int	noball_runs;
   private final int	penalty_runs;
   private final int	batsman_runs;
   private final int	extra_runs;
   private final int	total_runs;
   private final String player_dismissed;
   private final String dismissal_kind;
   private final String fielder;

    public Deliveries(int match_id, int inning, String batting_team, String bowling_team, int over, int ball, String batsman, String non_striker, String bowler, int is_super_over, int wide_runs, int bye_runs, int legbye_runs, int noball_runs, int penalty_runs, int batsman_runs, int extra_runs, int total_runs, String player_dismissed, String dismissal_kind, String fielder) {
        this.match_id = match_id;
        this.inning = inning;
        this.batting_team = batting_team;
        this.bowling_team = bowling_team;
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.non_striker = non_striker;
        this.bowler = bowler;
        this.is_super_over = is_super_over;
        this.wide_runs = wide_runs;
        this.bye_runs = bye_runs;
        this.legbye_runs = legbye_runs;
        this.noball_runs = noball_runs;
        this.penalty_runs = penalty_runs;
        this.batsman_runs = batsman_runs;
        this.extra_runs = extra_runs;
        this.total_runs = total_runs;
        this.player_dismissed = player_dismissed;
        this.dismissal_kind = dismissal_kind;
        this.fielder = fielder;
    }

    public Deliveries(Deliveries obj){
        this(obj.match_id, obj.inning, obj.batting_team, obj.bowling_team, obj.over, obj.ball, obj.batsman, obj.non_striker, obj.bowler, obj.is_super_over, obj.wide_runs, obj.bye_runs, obj.legbye_runs, obj.noball_runs, obj.penalty_runs, obj.batsman_runs, obj.extra_runs, obj.total_runs, obj.player_dismissed, obj.dismissal_kind, obj.fielder);
    }
    public int getMatch_id() {
        return match_id;
    }

    public int getInning() {
        return inning;
    }

    public String getBatting_team() {
        return batting_team;
    }

    public String getBowling_team() {
        return bowling_team;
    }

    public int getOver() {
        return over;
    }

    public int getBall() {
        return ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public String getNon_striker() {
        return non_striker;
    }

    public String getBowler() {
        return bowler;
    }

    public int getIs_super_over() {
        return is_super_over;
    }

    public int getWide_runs() {
        return wide_runs;
    }

    public int getBye_runs() {
        return bye_runs;
    }

    public int getLegbye_runs() {
        return legbye_runs;
    }

    public int getNoball_runs() {
        return noball_runs;
    }

    public int getPenalty_runs() {
        return penalty_runs;
    }

    public int getBatsman_runs() {
        return batsman_runs;
    }

    public int getExtra_runs() {
        return extra_runs;
    }

    public int getTotal_runs() {
        return total_runs;
    }

    public String getPlayer_dismissed() {
        return player_dismissed;
    }

    public String getDismissal_kind() {
        return dismissal_kind;
    }

    public String getFielder() {
        return fielder;
    }

   

}