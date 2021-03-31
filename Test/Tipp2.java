import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tipp2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tipp2 extends Actor
{
    /**
     * Act - do whatever the Tipp2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
           if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("Die Top 3 Wasserverbraucher sind Avocado, Kiwi und Bananen", 300,180);
    }    
}
