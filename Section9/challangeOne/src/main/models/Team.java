package models;
import java.util.Arrays;

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
            throw new IllegalArgumentException("House cannot be null or empty.");
        }
        if(seeker == null || seeker.equals("")){
            throw new IllegalArgumentException("House cannot be null or empty.");
        }
        if(chasers.length != 3){
            throw new IllegalArgumentException("House cannot be null or empty.");
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
        this.house = house;
    }

    public void setKeeper(String keeper) {
        this.keeper = keeper;
    }

    public void setSeeker(String seeker) {
        this.seeker = seeker;
    }

    public void setChasers(String[] chasers) {
        this.chasers = chasers;
    }

    @Override
    public String toString() {
        return "House: " + this.house + "\n" +
        "Keeper: " + this.keeper + "\n" +         
        "Seeker: "  + this.seeker + "\n" +         
        "Chasers: " + Arrays.toString(this.chasers) + "\n"; 
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
