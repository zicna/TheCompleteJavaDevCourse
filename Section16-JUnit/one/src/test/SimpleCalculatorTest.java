package one.src.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import one.src.main.SimpleCalculator;


public class SimpleCalculatorTest{
    @Test
    public void  testAddMethod(){
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void testThreeAddSeven(){
        SimpleCalculator calc = new SimpleCalculator();
        assertTrue(calc.add(3, 7) == 10);
    }
}