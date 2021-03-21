import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//public String myTextbox;
/**
 * Write a description of class Frage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frage extends Actor
{
    /**
     * Act - do whatever the Frage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();
        image.clear();
        image.setColor(Color.BLACK);
        image.drawString("test", 10, 10);
        
    }    
    /*public void writeText(String myText)
    {
        GreenfootImage image = getImage();
        image.clear();
        image.setColor(Color.BLACK);
        image.drawString(myText, 10, 10);
    }*/
    //myTextbox = new Score();
    //addObject(myTextbox, 4, 0);
    //myTextbox.writeText("Hello")
}
