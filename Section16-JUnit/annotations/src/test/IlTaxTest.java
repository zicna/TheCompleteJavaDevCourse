package annotations.src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import annotations.src.main.IlTax;

public class IlTaxTest{
    static int beforeClassCount = 1;
    static int beforeCount = 1;

    @Before
    public void beforeEcahTest(){
        System.out.println("this is run before each test " + beforeCount++);
    }

    @Test
    public void testpriceWithTax(){
        IlTax total = new IlTax();
        assertEquals(11, total.priceWithTax(10.0));
        
    }
    @Test
    public void testPrice100(){
        IlTax total = new IlTax();
        assertEquals(110, (int)total.priceWithTax(100.0));
        
    }
    @Test
    public void testPrice110(){
        IlTax total = new IlTax();
        assertEquals(121, (int)total.priceWithTax(110.0));
    }

    @AfterClass
    public static void atTheEnd(){
        System.out.println("The end");
    }
}