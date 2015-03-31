public class BaseBurger extends BurgerDecorator 
{
    String protein ="";
    String size ="";
    String servingStyle="";
    public BaseBurger(String protein,String size,String servingStyle){
        this.protein = protein;
        this.size = size;
        this.servingStyle = servingStyle;
        description = protein + " + "+ size + " + " + servingStyle;
    }
    
    public double cost(){
        double cost = 0;
        if(size.equals("1/3lb.")){
        cost = 9.50;
        }else if(size.equals("2/3lb.")){
            cost = 11.50;
        }else if(size.equals("1lb.")){
            cost = 15.50;
        }
        if(servingStyle.equals("In A Bowl")){
            cost = cost + 1;
        }
        return cost;
        }
    
     
}
