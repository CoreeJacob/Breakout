import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) { 
		this.y = y;
	}
	public void setWidth(int width) { 
		width = this.width;
	}
	public void setHeight(int height) { 
		height = this.height;
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return 0;	// TODO: Return correct value
	}
	public int getY() { 
		return 0;	// TODO: Return correct value
	}
	public int getWidth() { 
		return 0;	// TODO: Return correct value
	}
	public int getHeight() { 
		return 0;	// TODO: Return correct value
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
