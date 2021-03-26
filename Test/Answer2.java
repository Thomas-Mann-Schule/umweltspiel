import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Answer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Answer2 extends Actor
{
    /**
     * Act - do whatever the Answer2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.getWorld().showText("Industrie", 320,380);
        if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("Richtig", 450,300);
    }    
}
