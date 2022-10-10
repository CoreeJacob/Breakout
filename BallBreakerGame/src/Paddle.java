import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	private int paddleWidth, paddleHeight;
	
	public Paddle() {
		paddleWidth = Settings.PADDLE_WIDTH;
		paddleHeight = Settings.PADDLE_HEIGHT;
		resetPosition();
	}
	
	public void resetPosition() {
		setX(Settings.INITIAL_PADDLE_X);
		setY(Settings.INITIAL_PADDLE_Y);
	}
	
	public void update() {
		x += xVelocity;
		
		if (x >= 0) {
			setXVelocity(0);
		}
		if(x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
			setXVelocity(0);
		}

	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		vel = this.xVelocity;
	}
}
