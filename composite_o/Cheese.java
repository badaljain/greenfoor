
/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends BurgerDecorator
{   
    private double cost;
    private String[] cheeses;
    
    public Cheese(BurgerDecorator tempBurger, String[] cheeseArr){
        super(tempBurger);
        this.cheeses = cheeseArr;
    }
    
    public double getCost(){
        cost=super.getCost();
        int no = cheeses.length;
        if (no > 1)
            cost += (no-1) * 1;
        return cost;
    }
    
    public void printDescription(){
        super.printDescription();
        String print = "";
        for(String s : cheeses){
            print += s + " + ";
        }
        int len  = print.length();
        System.out.println(print.substring(0,len-2));
    }
    
}
