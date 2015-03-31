import java.util.List;
import java.util.ArrayList;

public class Premium extends BurgerDecorator {
    public double cost;
    List<String> addPremium = new ArrayList<String>();

    public Premium(Burger burger, List<String> premium) {
        super(burger);
        addPremium = premium;
    }

    public double getCost() {
        cost = super.getCost();
        for (String premium : addPremium ){
              if (premium.equalsIgnoreCase("Marinated Tomatoes")) {
                  cost += 3.00;
              }
              else cost += 1.00;
            }
     return cost;
    }

    public void printDescription(){
       super.printDescription();
       String premiumDecorator = "";
       for(String premium : addPremium){
            premiumDecorator += premium + " + ";
       }
       System.out.println(premiumDecorator.substring(0, premiumDecorator.lastIndexOf("+") ) );
    }
}
