import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Enemy {
	private int x, y;
	private int spdx = 5;

	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(x, y, 20, 20);
	}

	public void update() {
		x += spdx;
		if (x < 0) {
			x = 0;
			spdx = 5;
		}
		if (x > 620) {
			x = 620;
			spdx = -5;
		}
	}
	public Rectangle getBound(){
		return new Rectangle(x, y, 20, 20);
	}
}
