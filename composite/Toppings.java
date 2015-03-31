import java.util.List;
import java.util.ArrayList;

public class Toppings extends BurgerDecorator {
	public double cost;
	List<String> addToppings = new ArrayList<String>();

	public Toppings(Burger burger, List<String> toppings) {
		super(burger);
		addToppings = toppings;
	}

	public double getCost() {
		cost = super.getCost();
		/*if (addToppings.size() > 4) {
			cost += (addToppings.size() - 4) * 0.75;
		}*/
	return cost;
	}

    public void printDescription()
    {
       super.printDescription();
       String toppingDecorator = "";
       for(String topping : addToppings)
       {
            toppingDecorator += topping + " + ";
       }
       System.out.println(toppingDecorator.substring(0, toppingDecorator.lastIndexOf("+") ) );
    }
}
