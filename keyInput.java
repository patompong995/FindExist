import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyInput extends KeyAdapter {
	Player p;

	public keyInput(Player p) {
		this.p = p;
	}

	public void keyPressed(KeyEvent e) {
		p.keyPressed(e);
	}

	public void keyReleased(KeyEvent e) {
		p.keyReleased(e);
	}
}
