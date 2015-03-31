
/**
 * Write a description of class No50CentsState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class No50CentsState implements State{
    
   GumballMachine gumballMachine;
   
 
    public No50CentsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
         gumballMachine.coinValue +=25;
            System.out.println("You inserted a quarter");
        if(gumballMachine.coinValue >= 50){ 
            gumballMachine.setState(gumballMachine.getHas50CentsState());
        }
    }
       
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's not enough money");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
