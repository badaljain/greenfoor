
/**
 * Write a description of class Toppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Topping extends BurgerDecorator
{
    private double cost;
    private String[] toppings;
   
    public Topping(BurgerDecorator tempBurger, String[] toppingArr){
        //this.burger = tempBurger;
        super(tempBurger);
        this.toppings = toppingArr;
    }
    
    public double getCost(){
        cost=super.getCost();
        int no = toppings.length;
        if (no>4)
            cost += (no-4) * 0.75;
        return cost;
    }
    
    public void printDescription(){
        super.printDescription();
        String print = "";
        for(String s : toppings){
            print += s + " + ";
        }
        int len  = print.length();
        System.out.println(print.substring(0,len-2));
    }
    
}
