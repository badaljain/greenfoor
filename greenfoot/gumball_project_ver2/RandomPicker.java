import greenfoot.*;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void pick()
   {  
       World world = getWorld();
       Gumball gb = new GreenGumball();
       List <Inspector> inspec = getWorld().getObjects(Inspector.class);
       int num = inspec.get(0).pickerSize();
       int lottery = Greenfoot.getRandomNumber(num);
       switch(lottery){
        case 0: gb = new GreenGumball(); break;
        case 1: gb = new BlueGumball(); break;
        case 2: gb = new RedGumball(); break;
        }
        //System.out.println("Display object "+ gb.getClass().getName());
        world.addObject(gb, 500,500);
    } 
}
