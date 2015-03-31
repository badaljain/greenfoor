
/**
 * Write a description of class Sauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends BurgerDecorator
{
    private double cost;
    private String[] sauces;
    
    public Sauce(BurgerDecorator tempBurger, String[] sauceArr){
        //this.burger = tempBurger;
        super(tempBurger);
        this.sauces = sauceArr;
    }
    
    public double getCost(){
        cost=super.getCost();
        int no = sauces.length;
        if (no > 1)
            cost += (no-1) * 0.75;
        return cost;
    }
    
    public void printDescription(){
        super.printDescription();
        String print = "";
        for(String s : sauces){
            print += s + " + ";
        }
        int len  = print.length();
        System.out.println(print.substring(0,len-2));
    }
}
