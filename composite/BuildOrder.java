import java.util.List;
import java.util.ArrayList;

public class BuildOrder {
    public static Component getOrder()
    {
        Composite myOrder = new Composite( "Order" ) ;
        /*myOrder.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        myOrder.addChild(new Leaf("The Purist", 8.00 ));*/
        
        Composite customBurger1 = new Composite( "Build Your Own Burger" );
        Composite customBurger2 = new Composite( "Build Your Own Burger" );

        List<String> addCheese = new ArrayList<String>();
        List<String> addTopping = new ArrayList<String>();
        List<String> addPremium = new ArrayList<String>();
        List<String> addSauce = new ArrayList<String>();
        List<String> addPremiumCheese = new ArrayList<String>();
        List<String> addBun = new ArrayList<String>();
        List<String> addSides = new ArrayList<String>();
        
        // Build Order 1
        addCheese.add("Yellow American");
        addCheese.add("Spicy Jalapeno Jack");
        addPremiumCheese.add("Danish Blue Cheese");
        addSauce.add("Thai Peanut Sauce");
        addSauce.add("Mayonnaise");
        addTopping.add("Dill Pickle Chips");
        addTopping.add("Black Olives");
        addTopping.add("Spicy Pickles");
        addPremium.add("Marinated Tomatoes");
        addBun.add("Ciabatta");
        addSides.add("Shoestring Fries");
        
        Burger makeBurger1 = new Side(new Bun(new Premium(new Toppings(new Sauce(new PremiumCheese(new Cheese(new SimpleBurger("Organic Bison","1/2lb","On A Bun"), addCheese), addPremiumCheese), addSauce), addTopping), addPremium), addBun), addSides);
        customBurger1.setCustomBurger(makeBurger1);
        customBurger1.addChild(((Leaf)makeBurger1));
        myOrder.addChild(customBurger1);
        
        //Cleanup
        /*addCheese.clear();
        addTopping.clear();
        addPremium.clear();
        addSauce.clear();
        addPremiumCheese.clear();
        addBun.clear();
        addSides.clear();*/
        
        List<String> addCheese2 = new ArrayList<String>();
        List<String> addTopping2 = new ArrayList<String>();
        List<String> addPremium2 = new ArrayList<String>();
        List<String> addSauce2 = new ArrayList<String>();
        List<String> addPremiumCheese2 = new ArrayList<String>();
        List<String> addBun2 = new ArrayList<String>();
        List<String> addSides2 = new ArrayList<String>();
        
        // Building Order 2
        addCheese2.add("Greek Feta");
        addCheese2.add("Smoke Gouda");
        addPremiumCheese2.add("Fresh Mozarella");
        addSauce2.add("Habanero Salsa");
        addTopping2.add("Crushed Peanuts");
        addPremium2.add("Sunny Side up Egg");
        addPremium2.add("Marinated Tomatoes");
        addBun2.add("Gluten Free Bun");
        addSides2.add("Shoestring Fries");

//        Burger makeBurger = new Sauce(new Premium(new Toppings(new Cheese(new SimpleBurger("Hormone & Antibiotic Free Beef","1/3lb","On A Bun"), addCheese), addTopping), addPremium),addSauce);
        Burger makeBurger2 = new Side(new Bun(new Premium(new Toppings(new Sauce(new PremiumCheese(new Cheese(new SimpleBurger("Hormone & Antibiotic Free Beef","1/3lb","On A Bun"), addCheese2), addPremiumCheese2), addSauce2), addTopping2), addPremium2), addBun2), addSides2);
        customBurger2.setCustomBurger(makeBurger2);
        customBurger2.addChild(((Leaf)makeBurger2));
        myOrder.addChild(customBurger2);
              
        return myOrder ;
        
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/