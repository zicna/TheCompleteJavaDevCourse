// package main;
import models.Game;
import models.Team;

public class Main {

    static Game game;

    public static void main(String[] args) {
        Team teamOne = new Team("GRYFFINDOR", "Oliver", "Harry", new String[] {"Angelina", "Ginny", "Katie"});
        
        Team teamTwo =new Team("SLYTHERIN", "Vincent",  "Draco", new String[] {"Bridget", "Harper", "Malcolm"});
        System.out.println(teamOne);
        System.out.println(teamTwo);

    }


    /**
     * Function name: getData
     * @return (String[][])
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Returns data from TEAMS_FILE as a String[][] array
     */


    /** Function name: startGame
     * 
     * Inside the function:
     *    1. Grabs each play from plays.txt and calls game.simulate(play);
     *    2. Prints the return from game.simulate(play)
     *        - println("\n" + <return> + "\n");
     */


    /** Function name: printResult()
     * 
     * Inside the function:
     *    1. Prints the final score: println("\nGRYFFINDOR: " + <gryffindor score> + " SLYTHERIN: " + <slytherin score>);
     *    2. Prints the winner: println("\n" + <winner team name> + " WINS!");
     *  
     */

    /**
     * Function name: wait
     * @param sec
     * 
     * Inside the function:
     *  1. Make the code sleep for X seconds.
     */


  }

