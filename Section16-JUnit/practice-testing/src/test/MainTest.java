package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.MainClass;

public class MainTest {
    @Test
    public void doubleIntTest(){
        assertEquals(8, MainClass.doubleInt(4));
    }
    
}
