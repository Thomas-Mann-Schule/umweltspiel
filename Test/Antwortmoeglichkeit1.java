import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Antwortmoeglichkeit1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Antwortmoeglichkeit1 extends Actor
{
    /**
     * Act - do whatever the Antwortmoeglichkeit1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = new GreenfootImage("images/th.png");     //Bild einlesen und in image speichern
        image.scale(image.getWidth()/4,image.getHeight()/4);            //Größe des Bildes verändern
        this.getWorld().showText("Amerika", 100,500);                   //Beschriftung des Buttons einfügen
        if(Greenfoot.mouseClicked(this)){                               //Wenn Button geklickt wird
           setImage(image);                                             //Bild anzeigen
           Greenfoot.delay(100);                                        //Kurz pausieren
           Greenfoot.setWorld(new MyWorld2());                          //In die nächste Welt springen
        }    
    }
}
