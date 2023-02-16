package _02_Firework_Display;

import java.awt.Graphics;
import java.util.Random;

/*
 * 
 * You can think of a fire work as an array of sparks. Run the demo jar to see the finished product
 * then complete the steps. 
 *
 */

public class Firework{
    public static final int GRAVITY = 1;

    // 1. Create an array of Spark objects called sparks. Don't initialize it.
    Spark[] s;

    public boolean dead = false;

    public Firework() {
        // 2. Initialize the Spark array to contain 100 Sparks. 
    	
    	s = new Spark[100];


        // 3. Iterate through the sparks and initialize each one to a new Spark.
        //    Make each spark start at the middle bottom of the screen.
    	
    	for (int i = 0; i < s.length; i++) {
    		s[i] = new Spark(FireworkDisplay.WIDTH / 2, FireworkDisplay.HEIGHT);
    	}

    }

    public void launch() {
        // 4. Iterate through the sparks and reset their x and y location
        //    to their original starting point.
    	
    	for (int i = 0; i < s.length; i++) {
    		s[i] = new Spark(FireworkDisplay.WIDTH / 2, FireworkDisplay.HEIGHT);
    	}

    }

    public void updateSparks() {
        // 8. Uncomment this code. See if you can understand what it is doing.

         for(int i = 0; i < s.length; i++) {
         
             Spark sparks = s[i];
             sparks.x += sparks.xVelocity;
             sparks.y += sparks.yVelocity;
             sparks.yVelocity += GRAVITY;
         
             if(sparks.yVelocity >= 0 && !sparks.fire) {
                 Random r = new Random();
                 sparks.xVelocity = r.nextInt(40) - 20;
                 sparks.yVelocity += -r.nextInt(10) - 5;
                 sparks.size = r.nextInt(7) + 2;
                 sparks.fire = true;
             }
         
             if(sparks.y >= FireworkDisplay.HEIGHT) {
                 sparks.dead = true;
             }
         }
         
         for(int i = 0; i < s.length; i++) {
             if(!s[i].dead) {
                 dead = false;
                 break;
             }
             dead = true;
         }
    }

    public void drawSparks(Graphics g) {
        // 5. Iterate through each spark
        // 6. Set the color to the spark's color with g.setColor()
        // 7. Fill in an oval using the spark's x, y, and size with g.fillOval()
    	
    	for (int i = 0; i < s.length; i++) {
    		g.setColor(s[i].color);
    		g.fillOval(s[i].x, s[i].y, s[i].size, s[i].size);
    	}
    	
    }
}
