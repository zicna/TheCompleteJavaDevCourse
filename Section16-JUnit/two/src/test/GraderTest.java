package two.src.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import two.src.main.Grader;

public class GraderTest {

    @Test
    public void fiftynineReturnsF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    public void sixtyReturnsD(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }
    @Test
    public void seventyReturnsD(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(70));
    }
    @Test
    public void eightyReturnsD(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }
    @Test
    public void nineghtyReturnsD(){
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    public void negativeNumReturnsException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> grader.determineLetterGrade(-1));
    }


    
}
