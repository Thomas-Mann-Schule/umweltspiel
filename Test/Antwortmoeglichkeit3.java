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
        GreenfootImage image = new GreenfootImage("images/11.png");             // Bild einlesen und in image speichern
        image.scale(image.getWidth()/4,image.getHeight()/4);                    // Größe des Bildes verändern
        this.getWorld().showText("Europa", 800,500);                            // Beschriftung des Buttons einfügen
        if(Greenfoot.mouseClicked(this)){                                       // Wenn Button geklickt wird 
           setImage(image);                                                     // Bild anzeigen
        }
    }    
}
