import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Answer1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Answer1 extends Actor
{
    /**
     * Act - do whatever the Answer1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.getWorld().showText("Haushalt", 60,380);
        if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("Falsch", 450,300);
    }    
}
