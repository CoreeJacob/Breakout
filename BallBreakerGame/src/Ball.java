import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	private int ballWidth, ballHeight;
	
	// Constructor
	public Ball() {
		ballWidth = Settings.BALL_WIDTH;  // TODO: Set width to Settings.BALL_WIDTH		//COMPLETED
		ballHeight = Settings.BALL_HEIGHT;  // TODO: Set width to Settings.BALL_HEIGHT	//COMPLETED
		resetPosition();  // TODO: Call resetPosition									//COMPLETED
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		setY(Settings.INITIAL_BALL_Y);  // TODO: Set the balls y by using the INITIAL_BALL_Y (see above)   //COMPLETED
	}
	
	public void update() {						//FOR SELF - DELETE
												//NEED TO COMPLETE FROM HERE
		x += xVelocity;
		y += yVelocity;  // TODO: Increase the y variable by yVelocity (see above)		//COMPLETED
		
		// Bounce off left side of screen
		if(x <= 0) {				//I think x is equal to the position of the ball 
			// TODO: Set x to 0 so it does not leave the screen
			// TODO: Change the x velocity to make the ball go right
			setXVelocity(-xVelocity);
			
		}
		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			// TODO: Set x to the right edge of the screen (see the above if condition)
			// TODO: Change the x velocity to make the ball go left
			
			setXVelocity(xVelocity);
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			// TODO: Set y to 0 so it does not leave the screen
			// TODO: Change the y velocity to make the ball go downward
			setYVelocity(-yVelocity);
		}
		
	}
	
	public void setXVelocity(int x) {
		xVelocity = this.xVelocity;  // TODO: Set the x velocity	//COMPLETED
	}
	public void setYVelocity(int y) {
		yVelocity = this.yVelocity;  // TODO: Set the y velocity	//COMPLETED
	}
	
	public int getXVelocity() {
		return xVelocity;  // TODO: Return the x velocity		//COMPLETED
	}
	public int getYVelocity() {
		return yVelocity;	// TODO: Return the y velocity		//COMPLETED
	}
	
	public void paint(Graphics g) {
		g.fillOval(Settings.INITIAL_BALL_X, Settings.INITIAL_BALL_Y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
