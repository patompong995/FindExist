import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player {
	private int x;
	private int y;
	private int spdx = 0;
	private int spdy = 0;
	private LinkedList<Enemy> e = controlEnemy.getEnemyBounds();
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {
		x += spdx;
		y += spdy;
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		if (x > 620) {
			x = 620;
		}
		if (y > 440) {
			y = 440;
		}
	}

	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.fillOval(x, y, 20, 20);
//		g2d.getBounds();
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			spdx = -5;
		}
		if (key == KeyEvent.VK_RIGHT) {
			spdx = 5;
		}
		if (key == KeyEvent.VK_UP) {
			spdy = -5;
		}
		if (key == KeyEvent.VK_DOWN) {
			spdy = 5;
		}

	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			spdx = 0;
		}
		if (key == KeyEvent.VK_RIGHT) {
			spdx = 0;
		}
		if (key == KeyEvent.VK_UP) {
			spdy = 0;
		}
		if (key == KeyEvent.VK_DOWN) {
			spdy = 0;
		}
	}
	public Rectangle getBounds(){
		return new Rectangle(x, y,20,20);
	}
	public void conlision(){
		for(int i=0;i<e.size();i++){
			if(getBounds().intersects(e.get(i).getBound())){
				System.out.println("Fuckkkk");
			}
		}
	}

}
