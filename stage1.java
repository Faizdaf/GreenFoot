import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.concurrent.Phaser;

/**
 * 
 */
public class stage1 extends MyWorld
{
    int gravity = 5;
    
    public void setGravity(int gravity){
        this.gravity = gravity;
    }

    /**
     * Constructor for objects of class stage1.
     */
    public stage1()
    {
        Player snake = new Player();
        this.addObject(snake, 300, 200);
        this.gravity = 5;
        Player snake2 = new Player();
        this.addObject(snake2, 500, 0);
    }
    
    public void act(){
        List<animal> allChars = this.getObjects(animal.class);
        for(animal chara : allChars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }
}
