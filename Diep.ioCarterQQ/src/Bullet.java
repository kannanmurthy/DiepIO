import java.awt.Color;
import java.awt.Graphics;


public class Bullet extends GameObject {

	final int CONSTANT_SIZE=5;
	
	public Bullet(double speed, double direction, double power, double x, double y){
		super(speed, direction, x, y, 2, 1, power, 0, new Color (0,0,0));
		DiepIOMap.bullets.add(this);

	}
	public void HitObject(GameObject go){
		go.setHealth(go.getHealth()-getPower());
		terminate();
	}

	@Override
	public void checkOffScreen() {
		// TODO Auto-generated method stub

	}

	public void draw(Graphics g, int x, int y){

	}
	pbulic void terminate(){
		DoepIOMap.bullets.remove(this);
		super.terminate();
	}
	@Override
	public void draw(Graphics g) {

		g.drawOval((int)getX(), (int)getY(), CONSTANT_SIZE, CONSTANT_SIZE);
	}

}
