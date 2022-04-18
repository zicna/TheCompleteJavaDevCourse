package main.models;

import java.util.HashMap;

public class Game{
    HashMap<Team, Integer> scoreboard;

    
    public Game(Team home, Team away){
        scoreboard = new HashMap<Team, Integer>();
        scoreboard.put(new Team(home), 0);
        scoreboard.put(new Team(away), 0);
    }

    public Integer getScore(Team team){
        return scoreboard.get(team);
    }

    public void setScore(Team team, Integer score){
        scoreboard.put(team, score);
    }

    public Team getTeam(String name){
        return null;
    }

    // public void setTeam(){

    // }





    

}