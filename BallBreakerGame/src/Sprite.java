import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement
	public void setX(int x) {
		x = this.x;
	}
	public void setY(int y) { 
		y = this.y;  // TODO
	}
	public void setWidth(int width) { 
		width = this.width;  // TODO
	}
	public void setHeight(int height) { 
		height = this.height;  // TODO
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return x;	// TODO: Return correct value			//COMPLETED
	}    
	public int getY() { 
		return y;	// TODO: Return correct value			//COMPLETED
	}
	public int getWidth() { 
		return width;	// TODO: Return correct value		//COMPLETED
	}
	public int getHeight() { 
		return height;	// TODO: Return correct value		//COMPLETED
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
