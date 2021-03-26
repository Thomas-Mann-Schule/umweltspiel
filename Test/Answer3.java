import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Answer3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Answer3 extends Actor
{
    /**
     * Act - do whatever the Answer3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.getWorld().showText("Europa",600,380);
        if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("Falsch", 450,300);
    }    
}
