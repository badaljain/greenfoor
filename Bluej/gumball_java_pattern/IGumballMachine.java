
/**
 * Write a description of interface IGumbalMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IGumballMachine
{
      
     public void insertQuarter();
     public void insertDime();
     public void insertNickel();
     public void turnCrank();
     public boolean isGumballInSlot();
     public void takeGumballFromSlot();

}
