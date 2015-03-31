 
import java.util.List;
import java.util.ArrayList;

public class Composite implements Component {

    private List<Component> components = new ArrayList<Component>();
    private String description ;
    private Burger customBurger;
    public static double cost = 0;
        
    public Composite ( String d ){
        description = d ;
    }

    public void printDescription() {
        if(null != customBurger ){
            System.out.println( description+" : " + customBurger.getCost());
        }
        else{
            System.out.println( description );
        }
        for (Component obj  : components)
        {
            obj.printDescription();
                      
        }
        System.out.println("\n");
      }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
    public void setCustomBurger(Burger burger){
       customBurger = burger;
       }

    /*@Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 0;
    }*/
     
}
 
