import java.text.DecimalFormat;
public class MyBurger extends Composite
{
    private String description ;
    private Double price ;
    private BurgerDecorator burger;
    
    public MyBurger (BurgerDecorator burger)
    {
        this.burger = burger;
        price = burger.cost() ;
        description = "Build Your Own Burger";
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(price) ) ;
        this.burger.printDescription();
    }
}
