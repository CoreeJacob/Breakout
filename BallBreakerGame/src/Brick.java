import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	private int brickWidth, brickHeight;
	
	public Brick(int x, int y) {
		
		x = this.x;
		y = this.y;
		brickWidth = Settings.BRICK_WIDTH;
		brickHeight = Settings.BRICK_HEIGHT;
	}

	public boolean isBroken() {
		return broken;	// TODO: Return the correct variable
	}
	public void setBroken(boolean b) {
		// TODO: Set the broken variable using the parameter given
		this.broken = b;
		
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
