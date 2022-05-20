package JUnit_classes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class Assert{

    String temp, str;
    int num;
    IllegalArgumentException exception;

    @Before
    public void setUp(){
        num = 5;
        temp = null;
        str = "JUnit is working!";
    }

    @Test
    public void test1(){
        assertEquals("JUnit is working!", str);
    }
    @Test
    public void test2(){
        assertNotEquals("JUnit is working", str);
    }
    @Test
    public void test3(){
        assertTrue(num > 4);
    }
    @Test
    public void test4(){
        assertFalse(num < 5);
    }
    @Test
    public void test5(){
       
        assertNull(temp);
    }
    @Test
    public void test6(){
        assertNotNull(str);
    }

    
    
}