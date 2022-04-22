package main.models;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";

/* FREQUENTLY ASKED QUESTIONS:
    
Question: the constants are final, so why can't we make them public? It's not possible for the caller to update them.
  Answer: Even if the constant is final, I prefer to expose a method instead of the variable. But if you want to expose the variable, that's also correct.

*/

    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;

    public Team(String house, String keeper, String seeker, String[] chasers){
        if(house == null || house.equals("")){
            throw new IllegalArgumentException("House cannot be null or empty.");
        }
        if(keeper == null || keeper.equals("")){
            throw new IllegalArgumentException("Keeper cannot be null or empty.");
        }
        if(seeker == null || seeker.equals("")){
            throw new IllegalArgumentException("Seeker cannot be null or empty.");
        }
        if(chasers.length != 3){
            throw new IllegalArgumentException("Chasers must have three members.");
        }
        if(Team.hasNull(chasers) || Team.hasBlank(chasers)){
            throw new IllegalArgumentException("Chasers memebers cannot be null or empty.");
        }
        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
    }

    public Team(Team source){
        this.house = source.house;
        this.keeper = source.keeper;
        this.seeker = source.seeker;
        this.chasers = source.chasers;
    }

    public String getHouse() {
        return house;
    }
    public String getKeeper() {
        return keeper;
    }
    public String getSeeker() {
        return seeker;
    }
    public String[] getChasers() {
        return chasers;
    }

    public void setHouse(String house) {
        checkParam(house);
        this.house = house;
    }

    public void setKeeper(String keeper) {
        checkParam(keeper);
        this.keeper = keeper;
    }

    public void setSeeker(String seeker) {
        checkParam(seeker);
        this.seeker = seeker;
    }

    public void setChasers(String[] chasers) {
        if(Team.hasBlank(chasers) || Team.hasBlank(chasers) || chasers.length != 3){
            throw new IllegalArgumentException("Illegal chaser argument.");
        }
        this.chasers = chasers;
    }

    @Override
    public String toString() {
        return "House: " + this.house + "\n" +
        "Keeper: " + this.keeper + "\n" +         
        "Seeker: "  + this.seeker + "\n" +         
        "Chasers: " + Arrays.toString(this.chasers) + "\n"; 
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Team)){
            return false;
        }

        Team team = (Team)obj;
        return this.getHouse().equals(team.getHouse()) &&
                this.getClass().equals(team.getClass()) &&
                this.getKeeper().equals(team.getKeeper()) &&
                Arrays.toString(this.getChasers()).equals(Arrays.toString(team.getChasers()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getHouse(), this.getKeeper(), this.getSeeker(), Arrays.toString(this.getChasers()));
    }

    public static boolean hasNull(String[] array){
        return Arrays.stream(array)
        .anyMatch(string -> string ==null);
    }

    public static boolean hasBlank(String[] array){
       return Arrays.stream(array)
       .anyMatch(item -> item.trim().equals(""));
    }

    public void checkParam(String param){
        if(param == null || param.trim().equals("")){
            throw new IllegalArgumentException(param + " cannot be blank or null");
        }
    }
    
     public static String getPositionChaser() {
         return POSITION_CHASER;
     }

     public static String getPositionSeeker() {
         return POSITION_SEEKER;
     }

     public static String getPositionKeeper() {
         return POSITION_KEEPER;
     }

}
