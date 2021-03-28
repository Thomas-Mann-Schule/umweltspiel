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
        GreenfootImage image = new GreenfootImage("images/11.png");
        image.scale(image.getWidth()/4,image.getHeight()/4);
        this.getWorld().showText("Europa", 800,500);
        if(Greenfoot.mouseClicked(this)){
           setImage(image);
        }
    }    
}
