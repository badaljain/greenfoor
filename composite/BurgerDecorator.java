

public class BurgerDecorator extends Leaf implements Burger
{
    public Burger burger;
    
    public BurgerDecorator(){}
    
    public BurgerDecorator(Burger burger2)
    {
       this.burger = burger2;
    }

    public double getCost()
    {
        return burger.getCost();
    }
   
      public String getDescription()
    {
        return "";
    }

	//@Override
	public void printDescription() {
	((Component)burger).printDescription();
		
	}

	//@Override
	public void addChild(Component c) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void removeChild(Component c) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
