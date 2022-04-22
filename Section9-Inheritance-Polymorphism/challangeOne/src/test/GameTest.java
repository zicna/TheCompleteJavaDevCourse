package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.models.Game;
import main.models.Team;

public class GameTest{
    Game game;

    @Before
    public void setup(){
        Team home = new Team("GRYFFINDOR", "Oliver", "Harry", new String[] {"Angelina", "Ginny", "Katie"});
        Team away = new Team("SLYTHERIN", "Vincent",  "Draco", new String[] {"Bridget", "Harper", "Malcolm"});
        game = new Game(home, away);
    }

    @Test
    public void getPlaceholderTest(){
        assertEquals("chaser", game.getPlaceholder("<chaser> gets the next pass"));
    }

    @Test
    public void replacePlaceholderTest(){
        assertEquals("Katie gets the next pass", game.replacePlaceholder("<chaser> gets the next pass", "chaser", "Katie"));
    }

    @Test
    public void quaffleScoreTest(){
        Team team = game.getTeam("GRYFFINDOR");
        game.quaffleScore(team);
        game.quaffleScore(team);
        assertEquals(Game.getQuafflePoints() * 2, game.getScore(team));
    }

    @Test 
    public void catchSnitchTest(){
        Team team = game.getTeam("SLYTHERIN");
        game.catchSnitch(team);

        assertEquals(game.getScore(team), Game.getSnitchPoints());
    }
}