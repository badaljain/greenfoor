 

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
        
        BurgerDecorator burgerItems = new BaseBurger("Beef","1/3lb.","On A Bun");
        burgerItems = new ChooseCheese(burgerItems,new String[] {"Danish Blue Cheese","Horseradish Cheddar"});
        burgerItems = new Toppings(burgerItems, new String[] {"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"});
        burgerItems = new PremiumTopping(burgerItems, new String [] {"Applewood Smoked Bacon"});
        burgerItems = new ChooseSauce(burgerItems, new String []{"Appricot Sauce"});
        order.addChild(new MyBurger(burgerItems));
        return order ;
    }

}
