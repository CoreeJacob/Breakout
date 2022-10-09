import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	private int paddleWidth, paddleHeight;
	
	public Paddle() {
		paddleWidth = Settings.PADDLE_WIDTH;  // TODO: Set width to Settings.PADDLE_WIDTH		//COMPLETED
		paddleHeight = Settings.PADDLE_HEIGHT;  // TODO: Set width to Settings.PADDLE_HEIGHT	//COMPLETED
		resetPosition();  // TODO: Call resetPosition
	}
	
	public void resetPosition() {
		// TODO: Set initial position x and y (use INITIAL_PADDLE_X/Y)							//COMPLETED
		setX(Settings.INITIAL_PADDLE_X);
		setY(Settings.INITIAL_PADDLE_Y);
	}
	
	public void update() {						
		x += xVelocity;							
		
		// TODO: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)
		if(x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
			setXVelocity(0);
		}
		
		if (x <= 0) {
			setXVelocity(0);
		}

	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		vel = this.xVelocity;  // TODO: Set x velocity //COMPLETED
	}
}
