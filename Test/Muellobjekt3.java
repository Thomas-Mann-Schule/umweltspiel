import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Muellobjekt3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muellobjekt3 extends Actor
{
    public Muellobjekt3 ()
    { GreenfootImage myImage = getImage ();
      int myNewHeight = (int)myImage.getHeight()/4;
      int myNewWidth = (int)myImage.getWidth()/4;
      myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Muellobjekt3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("USA ist auf Platz 1", 800,250);
    }    
}
