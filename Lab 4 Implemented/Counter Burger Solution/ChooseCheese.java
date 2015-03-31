public class ChooseCheese extends BurgerDecorator
{
    BurgerDecorator burgerDecorator;
    String[] chooseCheese = new String[8];
    public ChooseCheese(BurgerDecorator burgerDecorator,String[] chooseCheese){
       this.burgerDecorator = burgerDecorator;
       this.chooseCheese = chooseCheese;
    }
    public void printDescription(){
        String desc = "";
       burgerDecorator.printDescription();
        for (int i=0; i<chooseCheese.length; i++){
            desc = desc + chooseCheese[i];
            if(i != chooseCheese.length - 1)
            {
                desc = desc + " + ";
            }
            
        }
        System.out.println(desc);
    }
    //one cheese is free
    public double cost(){
        if(chooseCheese.length >= 2){
            return (1*(chooseCheese.length - 1)) + burgerDecorator.cost();
        }
         else
            return 0 + burgerDecorator.cost();
    }
}
