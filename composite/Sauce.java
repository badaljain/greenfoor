
import java.util.List;
import java.util.ArrayList;

public class Sauce extends BurgerDecorator {
	public double cost;
	List<String> addSauce = new ArrayList<String>();

	public Sauce(Burger burger, List<String> sauce) {
		super(burger);
		addSauce = sauce;
	}

	public double getCost() {
		cost = super.getCost();

		if ((addSauce.size() > 1)) {
			cost += ((addSauce.size()-1) * 0.50);
		}
		return cost;
	}
	
	public void printDescription()
    {
       super.printDescription();
       String sauceDecorator = "";
       for(String sauce : addSauce)
       {
            sauceDecorator += sauce + " + ";
       }
       System.out.println(sauceDecorator.substring(0, sauceDecorator.lastIndexOf("+") ) );
    }

}
