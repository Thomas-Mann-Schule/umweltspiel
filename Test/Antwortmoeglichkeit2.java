import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Antwortmoeglichkeit2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Antwortmoeglichkeit2 extends Actor
{
    /**
     * Act - do whatever the Antwortmoeglichkeit2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.getWorld().showText("Antwort2", 400,500);
        if(Greenfoot.mouseClicked(this))
            this.getWorld().showText("Richtig", 800,500);
            this.getWorld().addObject( new Startknopf(),200,200);
    }    
}
