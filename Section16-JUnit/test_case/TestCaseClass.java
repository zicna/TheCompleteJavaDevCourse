package test_case;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCaseClass extends TestCase{
@Test
public void testOne(){
    String testName = this.getName();
    System.out.println("this test name is " + testName);

    this.setName("testNewName");
    testName = this.getName();

    System.out.println("This is test new name " + testName);
}
}