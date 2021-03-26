import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Muellobjekt1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muellobjekt1 extends Actor
{
    public Muellobjekt1 ()
    { GreenfootImage myImage = getImage ();
      int myNewHeight = (int)myImage.getHeight()/2;
      int myNewWidth = (int)myImage.getWidth()/2;
      myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Muellobjekt1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("Deutschland produziert weniger Müll, als die USA", 300,150);
    }    
}
