import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Bun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bun extends BurgerDecorator
{
   public double cost;
    List<String> addBun = new ArrayList<String>();

    public Bun(Burger burger, List<String> buns) {
        super(burger);
        addBun = buns;
    }

    public double getCost() {
        cost = super.getCost();
        if (((addBun.size() >= 1) && ((addBun.contains("Gluten Free Bun")) || ((addBun.contains("Hawaiian Bun")))))) {
            cost += 1.00;
        }
        if ((addBun.size() >= 1) && ((addBun.contains("Pretzel Bun"))))
            cost += 0.50;
        return cost;
    } 
    
    public void printDescription(){
       super.printDescription();
       String cheeseDecorator = "";
       for(String cheese : addBun){
           cheeseDecorator += cheese + " + ";
       }
       System.out.println(cheeseDecorator.substring(0, cheeseDecorator.lastIndexOf("+") ) );
    }
}
