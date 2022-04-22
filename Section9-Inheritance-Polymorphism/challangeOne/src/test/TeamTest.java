package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;
import main.models.Team;

public class TeamTest{
    Team team;

    @Test
    public void hasNullTest(){
        String[] chasers = new String[] {null, "Ginny", "Katie"};
        assertTrue(Team.hasNull(chasers));
    }

    @Test
    public void hasBlankTest(){
        String[] chasers = {"   ", "Ginny", "Katie"}; 
        assertTrue(Team.hasBlank(chasers) );
    }
}