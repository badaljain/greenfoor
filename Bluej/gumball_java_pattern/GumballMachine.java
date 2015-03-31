

public class GumballMachine implements IGumballMachine {
 
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State has50CentsState;
    State no50CentsState;
    boolean isGumballInSlot = false;
 
    State state;
    int count = 0;
    
    int coinValue = 0;
    public int getCoinValue(){
        return this.coinValue;
    }
    
    public void setCoinValue(int value){
        this.coinValue = value;
    }
    
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        has50CentsState = new Has50CentsState(this);
        no50CentsState = new No50CentsState(this);
        state = soldOutState;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = no50CentsState;
        } 
    }
 
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    public void insertDime(){
       if(state != soldOutState){
           coinValue += 10;
           System.out.println("You inserted a Dime");
            if(coinValue >= 50){
                state = has50CentsState;
            }
        }
        else{
            System.out.println("You can't insert a Dime, the machine is sold out");
        }
    }
    
    public void insertNickel(){
        if(state != soldOutState){
            coinValue += 5;
            System.out.println("You inserted a Nickel");   
           if(coinValue >= 50){
               state = has50CentsState;
            }
        }
        else{
            System.out.println("You can't insert a Nickel, the machine is sold out");
        }
    }
    
 
    public void ejectQuarter() {
        state.ejectQuarter();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
    
     public State getHas50CentsState() {
        return has50CentsState;
    }
    
    public State getNo50CentsState() {
        return no50CentsState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public void takeGumballFromSlot(){
        isGumballInSlot = false;
        System.out.println("Gumball took from slot");
    }
    
    public boolean isGumballInSlot(){
        
        return isGumballInSlot;
    }
    
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
