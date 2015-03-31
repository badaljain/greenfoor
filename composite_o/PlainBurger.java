
/**
 * Write a description of class PlainBurger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlainBurger extends BurgerDecorator
{
   private String type, weight, holder;
   
   public PlainBurger(String type, String weight, String holder){
       this.type = type;
       this.weight = weight;
       this.holder = holder;
       description = type + " + " + weight + ". + " + holder;
    }
    
    public double getCost(){
        double cost = 0;
        
        if(weight.equalsIgnoreCase("1/3lb"))
            cost += 9.50;
        else if(weight.equalsIgnoreCase("2/3lb"))
            cost += 11.50;
        else
            cost+= 15.50;
        
        if(holder.equalsIgnoreCase("In A Bowl"))
            cost += 1;
        
        return cost;
    }
    
    public void printDescription(){
        System.out.println(description);
    
    }
}
