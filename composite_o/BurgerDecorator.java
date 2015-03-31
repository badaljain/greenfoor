
/**
 * Write a description of class BurgerDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurgerDecorator extends Leaf implements Burger 
{
    private BurgerDecorator burger;
    protected String description = "";

    public BurgerDecorator(){
    }
    
    public BurgerDecorator(BurgerDecorator burger){
        this.burger = burger;
    }
    
    public double getCost(){
        return burger.getCost();
    }
    
    public void printDescription() {
        burger.printDescription();;
    }
    
}
