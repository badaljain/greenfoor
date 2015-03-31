public abstract class BurgerDecorator extends Leaf implements PriceDecorator
{
    String description = "Unkown";
    private Double price ;
    public void printDescription() {
        System.out.println( description ) ;
    }
}
