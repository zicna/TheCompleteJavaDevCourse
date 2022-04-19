package main.models;

import java.util.HashMap;
// import java.util.stream.Collectors;

public class Game{
    HashMap<Team, Integer> scoreboard;
    private static int gameCount;
    private static final int QUAFFLE_POINTS = 10;
    private static final int SNITCH_POINTS = 150;

    
    public Game(Team home, Team away){
        scoreboard = new HashMap<Team, Integer>();
        scoreboard.put(new Team(home), 0);
        scoreboard.put(new Team(away), 0);
        gameCount++;
    }

    public Team geRandomTeam(){
        Object[] teams = scoreboard.keySet().toArray();
        return (Team)teams[random(teams.length)];
    }

    public int random(int range){
        return (int) (Math.random() * range);
    }

    

    public static int getQuafflePoints() {
        return QUAFFLE_POINTS;
    }

    public static int getSnitchPoints() {
        return SNITCH_POINTS;
    }

    public static int getGameCount() {
        return gameCount;
    }

    public Integer getScore(Team team){
        return scoreboard.get(team);
    }

    public void setScore(Team team, Integer score){
        scoreboard.put(team, score);
    }

    public String getPlaceholder(String play){
        return play.substring(play.indexOf("<") + 1, play.indexOf(">"));
    }

    public String replacePlaceholder(String play, String palceholder, String value ){
        return play.replace("<"+palceholder+">", value);
    }

    public void quaffleScore(Team team){
        this.setScore(team, this.getScore(team) + Game.getQuafflePoints());
    }

    public void catchSnitch(Team team){
        this.setScore(team, this.getScore(team) + Game.getSnitchPoints());
    }

    public Team getTeam(String name){
       return this.scoreboard.keySet().stream().filter(key -> key.getHouse().equals(name))
       .findFirst()
       .orElse(null);
    }

    // return this.scoreboard
    //     .entrySet()
    //     .stream()
    //     .filter(entry -> entry.getKey().getHouse().equals(name))
    //     .findFirst()
    //     .orElse(null)
    //     .getKey();
    // return this.scoreboard
    //     .keySet()
    //     .stream()
    //     .filter(key -> key.getHouse().equals(name))
    //     .collect(Collectors.toList())
    //     .get(0);
    // public void setTeam(){
    // }
}