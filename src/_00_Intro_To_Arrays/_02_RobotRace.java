package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args) {
		
		boolean hasFinished = false;
		int robVictoryNum = 404;
		
		// 2. create an array of 5 robots.
		
		Robot[] robArray = new Robot[10];
		
        // 3. use a for loop to initialize the robots
		
		for (int i = 0; i < robArray.length; i++) {
			robArray[i] = new Robot();
			robArray[i].setSpeed(25);
		}
		
		Robot.setWindowSize(1000, 600);

        // 4. make each robot start at the bottom of the screen, side by side, facing up
		
		for (int i = 0; i < robArray.length; i++) {
			robArray[i].setY(500);
			robArray[i].setX(50 + i * 100);
		}
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
		
		Random r = new Random();
		
		while (hasFinished == false) {
			for (int i = 0; i < robArray.length; i++) {
				robArray[i].move(r.nextInt(50));
				if (robArray[i].getY() <= 10) {
					robVictoryNum = i;
					hasFinished = true;
					robArray[i].sparkle();
					break;
				}
			}
		}
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
		
		JOptionPane.showMessageDialog(null, "Robot #" + (robVictoryNum + 1) + " has won!");
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
		
	}

}
