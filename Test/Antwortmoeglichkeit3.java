import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Antwortmoeglichkeit3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Antwortmoeglichkeit3 extends Actor
{
    /**
     * Act - do whatever the Antwortmoeglichkeit3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         this.getWorld().showText("Antwort3", 500,500);
        if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("Falsch", 800,500);
           this.getWorld().addObject( new Startknopf(),200,200);
    }    
}
