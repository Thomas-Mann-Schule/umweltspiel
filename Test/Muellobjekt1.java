import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Muellobjekt1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muellobjekt1 extends Actor
{
    /**
     * Act - do whatever the Muellobjekt1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //this.getWorld().showText("Hinweis 2", 400,500);
        if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("Hinweis 1", 800,500);
    }    
}
