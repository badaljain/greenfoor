 

public class BuildOrder {

    public static Component getOrder()
    {
       
       Composite myOrder = new Composite( "Order" ) ;
       BurgerDecorator burger = new PlainBurger("Beef" , "1/3lb" , "On A Bun");
       burger = new Cheese(burger, new String[] {"Danish Blue Cheese","Horseradish Cheddar"});
       burger = new Topping(burger,new String[]  {"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"});
       burger = new PremiumTopping(burger,new String[] {"Applewood Smoked Bacon"});
       burger = new Sauce(burger,new String[] {"Appricot Sauce"});
       myOrder.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
       myOrder.addChild(new Leaf("The Purist", 8.00 ));
       myOrder.addChild(new MyBurger(burger));
       
       return myOrder;
    }

}
