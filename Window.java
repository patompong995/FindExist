import java.awt.Dimension;

import javax.swing.*;
import java.awt.Dimension;

public class Window extends JFrame {
	public static final int x = 640;
	public static final int y = 480;
	Dimension size = new Dimension(x, y);
	public static Window Frame;

	public Window() {
		super("Find Exits");
		setSize(size);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(new Grapic());
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame = new Window();
	}

}
