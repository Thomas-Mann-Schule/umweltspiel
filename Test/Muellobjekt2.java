import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Muellobjekt2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muellobjekt2 extends Actor
{
    public Muellobjekt2 ()
    { GreenfootImage myImage = getImage ();
      int myNewHeight = (int)myImage.getHeight()/4;
      int myNewWidth = (int)myImage.getWidth()/4;
      myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Muellobjekt2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
           this.getWorld().showText("China und Japan sind unter den Top5", 350,180);
    }    
}
