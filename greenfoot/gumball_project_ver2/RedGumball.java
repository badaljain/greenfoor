import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedGumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedGumball extends Gumball
{
    /**
     * Act - do whatever the RedGumball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            world.removeObject(this);
        }
    }
    
     public void remove(){
        World world = getWorld();
        world.removeObject(this);
    }
    
}