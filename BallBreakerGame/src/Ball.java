import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	private int ballWidth, ballHeight;
	
	// Constructor
	public Ball() {
		ballWidth = Settings.BALL_WIDTH;
		ballHeight = Settings.BALL_HEIGHT;
		resetPosition();
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		setY(Settings.INITIAL_BALL_Y);
	}
	
	public void update() {
		x += xVelocity;
		y += yVelocity;
		
		// Bounce off left side of screen
		if(x <= 0) {
			// TODO: Set x to 0 so it does not leave the screen
			// TODO: Change the x velocity to make the ball go right
			setXVelocity(1);
		}
		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			// TODO: Set x to the right edge of the screen (see the above if condition)
			// TODO: Change the x velocity to make the ball go left
			setXVelocity(-1);
		}
		
		// Bounce off top of screen
		if(y == 0) {
			// TODO: Set y to 0 so it does not leave the screen
			// TODO: Change the y velocity to make the ball go downward
			setYVelocity(-1);
		}
		
	}
	
	public void setXVelocity(int x) {
		xVelocity = this.x;
	}
	public void setYVelocity(int y) {
		yVelocity = this.y;
	}
	
	public int getXVelocity() {
		return xVelocity;	
	}
	public int getYVelocity() {
		return yVelocity;	
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
