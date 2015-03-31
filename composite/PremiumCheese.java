import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class PremiumCheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumCheese extends BurgerDecorator
{
    public double cost;
    List<String> addPremiumCheese = new ArrayList<String>();

    public PremiumCheese(Burger burger, List<String> premiumCheese) {
        super(burger);
        addPremiumCheese = premiumCheese;
    }

    public double getCost() {
        cost = super.getCost();
        if (addPremiumCheese.size() >= 1) {
            cost += (addPremiumCheese.size() * 1.50);
        }
        return cost;
    }
    
    public void printDescription(){
       super.printDescription();
       String cheeseDecorator = "";
       for(String cheese : addPremiumCheese){
           cheeseDecorator += cheese + " + ";
       }
       System.out.println(cheeseDecorator.substring(0, cheeseDecorator.lastIndexOf("+") ) );
    }
}
