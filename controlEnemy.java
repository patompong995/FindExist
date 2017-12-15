import java.awt.Graphics2D;
import java.util.LinkedList;

public class controlEnemy {
	static LinkedList<Enemy> e = new LinkedList<>();
	Enemy temp;
	public controlEnemy(){
		addEnemy(new Enemy(120,20));
		addEnemy(new Enemy(380,200));
		addEnemy(new Enemy(100,120));
		addEnemy(new Enemy(500,300));
	}
	public void draw(Graphics2D g2d) {
		for (int i = 0; i < e.size(); i++) {
			temp = e.get(i);
			temp.draw(g2d);
		}
	}
	public void update(){
		for(int i=0;i<e.size();i++){
			temp=e.get(i);
			temp.update();	
		}
	}
	public void addEnemy(Enemy enemy){
		e.add(enemy);
	}
	public void removeEnemy(Enemy enemy){
		e.remove(enemy);
	}
	public static LinkedList<Enemy> getEnemyBounds(){
		return e;
	}
}
