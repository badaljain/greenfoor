
/**
 * Write a description of class Has50CentsState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Has50CentsState implements State
{
   GumballMachine gumballMachine;
 
    public Has50CentsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
   public void insertQuarter() {
		System.out.println("Sufficient Money in the Machine! please turn the Crank");
	}
    
    public void ejectQuarter() {
        System.out.println("Money returned");
        gumballMachine.coinValue = 0;
        gumballMachine.setState(gumballMachine.getNo50CentsState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
