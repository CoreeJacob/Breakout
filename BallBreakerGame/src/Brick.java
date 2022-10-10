import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	private int brickWidth, brickHeight;		
	
	public Brick(int x, int y) {
		x = this.x;// TODO: Set x using the parameter		//COMPLETED??
		y = this.y;// TODO: Set y using the parameter		//COMPLETED??
		
		// TODO: Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT		//COMPLETED
		brickWidth = Settings.BRICK_WIDTH; 
		brickHeight = Settings.BRICK_HEIGHT;
	}

	public boolean isBroken() {
		return broken;	// TODO: Return the correct variable
	}
	public void setBroken(boolean b) {
		this.broken = b;  // TODO: Set the broken variable using the parameter given
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}

