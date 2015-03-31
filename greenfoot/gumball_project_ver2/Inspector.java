import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   private ArrayList<Picker>  pickers =  new ArrayList<Picker>();
   
   public void addPicker(Picker obj){
       pickers.add(obj);
    }
    
   public void removePicker(Picker obj){
       pickers.remove(obj);
    }
    
   public int pickerSize(){
       return pickers.size();
    }
    
   public void inspect(Actor coin){
       //System.out.println("Coin : " + coin.getClass());
       int whichPicker = Greenfoot.getRandomNumber(pickers.size());
       System.out.println(" Pickers "+ pickers);
       Picker pickerChoosen = pickers.get(whichPicker);
       System.out.println("Picker : "+ pickerChoosen.getClass());
       if(coin.getClass() == Quarter.class){
           pickerChoosen.pick();
           
        }
       else{
           List <GumballMachine> gmList = getWorld().getObjects(GumballMachine.class);
           gmList.get(0).setMessage("        Sorry!" +  "\n Not a Quarter");
        }
    }
}
