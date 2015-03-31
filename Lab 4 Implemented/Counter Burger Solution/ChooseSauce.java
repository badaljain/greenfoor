public class ChooseSauce extends BurgerDecorator
{
    BurgerDecorator burgerDecorator;
    String[] chooseSauce = new String[15];
    public ChooseSauce(BurgerDecorator burgerDecorator,String[] chooseSauce){
       this.burgerDecorator= burgerDecorator;
       this.chooseSauce = chooseSauce;
    }
    public void printDescription(){
        String desc= "";        
        burgerDecorator.printDescription();
        for ( int i=0; i<chooseSauce.length; i++){
            desc = desc + chooseSauce[i];
            if(i != chooseSauce.length - 1)
            {
                desc = desc + " + ";
            }            
        }
        System.out.println(desc);
    }
    //free cheese section
    public double cost(){
        if( chooseSauce.length >= 2 ){
            return (1*( chooseSauce.length - 1 )) + burgerDecorator.cost();
        }
         else
            return 0 + burgerDecorator.cost();
    }
}
