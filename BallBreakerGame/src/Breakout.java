import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);  // TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setTitle(Settings.WINDOW_NAME);  // TODO: Set the title
		setBackground(Color.white);  // TODO: Set the background colour to white
		setResizable(false);  // TODO: Set resizable to false
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
		setVisible(true);  // TODO: Set visible to true
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();	
	         }
		});

	}
}
