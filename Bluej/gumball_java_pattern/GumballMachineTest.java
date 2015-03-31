

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    /**
     * Default constructor for test class GumballMachineTest
     */
    IGumballMachine m;
    
    public GumballMachineTest()
    {
        System.out.println("Hello GumballMachine");
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        System.out.println("Setup");
        m = new GumballMachine(10);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        System.out.println("Teardown");
        
    }
    
    //1. Insert only a quarter and turn the crank -- Expected false
    @Test
    public void testInsertQuarter(){
        System.out.println("Test 1");
        m.insertQuarter();
        m.turnCrank();
        assertFalse(m.isGumballInSlot());
    }
    
    //2. Insert Dimes and Nickles but total is less than 50 cents -- Expected Fasle
    
    @Test
    public void testDimeNickel(){
        System.out.println("Test 2");
        m.insertDime();
        m.insertDime();
        m.insertNickel();
        m.turnCrank();
        assertFalse(m.isGumballInSlot());
    }
    
    //3. Turn the crank without inserting a coin -- Expected Fasle
    @Test
    public void testNoCoin(){
                System.out.println("Test 3");
        m.turnCrank();
        assertFalse(m.isGumballInSlot());
    }
    
    //4. Insert Two Quarters and turn the crank -- Expected True
    @Test
    public void testTwoQuarters(){
                System.out.println("Test 4");
        m.insertQuarter();
        m.insertQuarter();
        m.turnCrank();
        assertTrue(m.isGumballInSlot());
    
    }
  
    //5. Insert quarter, dimes and nickel totalling to 50 cents -- Expected True
    @Test
    public void test50CentsCombination(){
                 System.out.println("Test 5");
        m.insertQuarter();
        m.insertDime();
        m.insertDime();
        m.insertNickel();
        m.turnCrank();
        assertTrue(m.isGumballInSlot());
    
    }
    
    //6. Insert more than 50 cents -- Expected True
    @Test
    public void testmoreThan50Cents(){
        System.out.println("Test 6");
        m.insertQuarter();
        m.insertDime();
        m.insertQuarter();
        m.turnCrank();
        assertTrue(m.isGumballInSlot());
    }
    
    //7. Insert more than 50 cents but Take gumball from slot before checking in slot -- Expected False
    
    @Test
    public void testTakeGumballFirst(){
        System.out.println("Test 7");
        m.insertQuarter();
        m.insertDime();
        m.insertQuarter();
        m.turnCrank();
        m.takeGumballFromSlot();
        assertFalse(m.isGumballInSlot());
    }
    @Test
    public void testUnit1()
    {
        m.insertQuarter();
        m.insertDime();
        m.insertNickel();
        m.insertNickel();
        m.insertNickel();
        m.turnCrank();
        assertEquals(true, m.isGumballInSlot());
    }
      @Test
    
    public void testUnit2()
    {
        m.insertQuarter();
        m.turnCrank();
        assertEquals(false, m.isGumballInSlot());
    }
    
    @Test
    
    public void testUnit3()
    {
        m.insertQuarter();
        m.insertQuarter();
        m.turnCrank();
        assertEquals(true, m.isGumballInSlot());
    }
        @Test
    
    public void testUnit4()
    {
        m.insertQuarter();
        m.insertQuarter();
        m.turnCrank();
        m.takeGumballFromSlot();
        assertEquals(false, m.isGumballInSlot());
    }
            @Test
    
    public void testUnit5()
    {
        m.insertQuarter();
        m.insertQuarter();
        m.insertNickel();
        m.insertNickel(); 
        m.turnCrank();
        assertEquals(true, m.isGumballInSlot());
    }
    
                @Test
    
    public void testUnit6()
    {
        m.insertQuarter();
        m.insertQuarter();
        m.insertNickel();
        m.insertNickel();
        m.turnCrank();
        assertEquals(true, m.isGumballInSlot());
    }
    
    
    
    
}
