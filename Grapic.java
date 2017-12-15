import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Grapic extends JPanel implements ActionListener {
	Player player;
	Timer loop;
	controlEnemy c;
	public Grapic() {
		loop = new Timer(10, this);
		loop.start();
		player = new Player(100, 100);
		c=new controlEnemy();
		addKeyListener(new keyInput(player));
		setFocusable(true);
		requestFocusInWindow();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, 640, 480);
		player.draw(g2d);
		c.draw(g2d);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		player.update();
		c.update();
		repaint();
	}
}
