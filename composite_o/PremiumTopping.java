
/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumTopping extends BurgerDecorator
{
    private double cost;
    private String[] premiums;
   
    
    public PremiumTopping(BurgerDecorator tempBurger, String[] premiumArr){
       // this.burger = tempBurger;
       super(tempBurger);
        this.premiums = premiumArr;
    }
    
    public double getCost(){
        cost=super.getCost();
        int no = premiums.length;
        return (cost += 1.50*no);
    }
    
    public void printDescription(){
        super.printDescription();
        String print = "";
        for(String s : premiums){
            print += s + " + ";
        }
        int len  = print.length();
        System.out.println(print.substring(0,len-2));
    }
}
