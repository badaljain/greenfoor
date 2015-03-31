
import java.text.DecimalFormat;
public class MyBurger extends Composite
{
    private String description ;
    private Double cost ;
    private BurgerDecorator burger;
   
    public MyBurger (BurgerDecorator burger)
    {
        this.burger = burger;
        cost = this.burger.getCost() ;
        description = "Build Your Own Burger";
    }
    
    public void printDescription() {
        System.out.println( description + " " + cost ) ;
        this.burger.printDescription();
    }
}
