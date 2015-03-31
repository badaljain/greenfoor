import greenfoot.*;
import java.util.List;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    Message m = new Message();
    Actor haveCoin;
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    
    public void setMessage(String msg){
        int mouseX, mouseY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX = mouse.getX();
        mouseY = mouse.getY();
        World world = getWorld();
        if(m.getWorld() != null){
            world.removeObject(m);
        }
        world.addObject(m, mouseX, mouseY);
        m.setText(msg);
    }
    
    public void act() 
    {
        int mouseX, mouseY ;
        Actor coin;
        coin = getOneIntersectingObject( Coin.class ) ;
        if(coin != null){
            //temp = coin.getClass();
            haveCoin = coin;
            World world = getWorld() ;
            world.removeObject( coin ) ;
            setMessage("Have Coin");
        }
       

        if(Greenfoot.mousePressed(this))
       {          
            setMessage("Crank Turned"); 
            List <Inspector> inspec = getWorld().getObjects(Inspector.class);
        
        if ( haveCoin != null )
        {   
             System.out.println( haveCoin.toString() ) ;
             inspec.get(0).inspect(haveCoin);
             haveCoin = null;
        }
        else{
            List <Gumball> gbDest = getWorld().getObjects(Gumball.class);
            Iterator it = gbDest.iterator();
            while(it.hasNext()){
                Gumball g = (Gumball)it.next();
                g.remove();
            }
            setMessage("Please insert" + "\n a Quarter"); 
        }
        }
       
        
    }    
}
