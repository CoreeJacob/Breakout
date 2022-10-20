import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);  
		setTitle(Settings.WINDOW_NAME);  
		setBackground(Color.white);  
		setResizable(false);  
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
