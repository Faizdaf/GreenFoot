import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class snake extends Actor
{

    /**
     * Act - do whatever the snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //add your action code here
        int xPoss = this.getX();
        int yPoss = this.getY();
        World wrld = this.getWorld();
        this.move(5);
        if(Greenfoot.isKeyDown("space")){
            this.setLocation(xPoss, yPoss-10);
        }
        
        if(xPoss == wrld.getWidth()-5){
            this.setLocation(0, yPoss);
        }
        
        if(yPoss == wrld.getHeight()-5){
            this.setLocation(xPoss, 5);
        }
        
    }
}
