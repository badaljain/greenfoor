public class PremiumTopping extends BurgerDecorator
{
    BurgerDecorator burgerDecorator;
    String[] premiumTopping = new String[15];
    public PremiumTopping(BurgerDecorator burgerDecorator, String[] premiumTopping){
       this.burgerDecorator = burgerDecorator;
       this.premiumTopping = premiumTopping;
    }
    
    public void printDescription(){
        String desc = "";
         burgerDecorator.printDescription();
        for(int i=0; i<premiumTopping.length; i++)
        {
            desc=desc + premiumTopping[i];
            if(i != premiumTopping.length - 1)
            desc = desc +" + ";
        }
        System.out.println(desc);
    }
    
    public double cost(){
        if(premiumTopping.length >= 1){
            return (1.50*premiumTopping.length) +burgerDecorator.cost();
        }
        else
            return 0+ burgerDecorator.cost();
    }
}
