import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tipp1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tipp1 extends Actor
{
    /**
     * Act - do whatever the Tipp1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("Erdbeeren verbrauchen weniger als Bananen", 300,150);
    }    
}
