 

public class Pessimist extends ConcreteObserver {

    public Pessimist( ConcreteSubject sub )
    {
        super( sub ) ;
    }

    public void update() {
        System.out.println(subject.getClass().getName());
        if ( subject.getState().equalsIgnoreCase("The Price of gas is at $5.00/gal") )
        {
            System.out.println(subject.getClass().getName());
            observerState = "This is the beginning of the end of the world!" ;
        }
        else if ( subject.getState().equalsIgnoreCase( "The New iPad is out today" ) )
        {
            observerState = "Not another iPad!"  ;
        }
        else
        {
            observerState = ":(" ;
        }
    }
     
}
 
