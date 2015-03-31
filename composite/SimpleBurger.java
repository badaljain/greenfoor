
public class SimpleBurger extends BurgerDecorator
{
   String burgerType,weight,container;
   double addedCost=0.0;
    
    public SimpleBurger(String burgerType, String weight, String container)
    {
        this.burgerType=burgerType;
        this.container=container;  
        this.weight=weight;
    }

    public double getCost()
    {
        if(weight == "1/3lb")
            addedCost += 9.00;
        else if(weight == "1/2lb")
            addedCost += 12.00;
        else if(weight == "1lb") // 1lb
            addedCost += 18.00;
        
            if(!container.equalsIgnoreCase("On A Bun"))
            addedCost += 1.00;
            
        if((burgerType.equalsIgnoreCase("Organic Bison")) || ((burgerType.equalsIgnoreCase("Ahi Tuna"))))
            addedCost += 4.00;
        return addedCost;
    }
    
    public String getDescription()
    {
        return burgerType + " + " + weight + ". + " + container;
    }

    @Override
    public void printDescription() {
        // TODO Auto-generated method stub
        System.out.println(getDescription());
    }

    @Override
    public void addChild(Component c) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeChild(Component c) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Component getChild(int i) {
        // TODO Auto-generated method stub
        return null;
    }
}
