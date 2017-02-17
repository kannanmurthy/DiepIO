import java.awt.Color;
import java.awt.Graphics;


public class  ShootableFarm extends GameObject {
	
	
	public ShootableFarm(double x, double y,double size, double health){
		super(0, 0, x, y, size, health, 0,0, new Color(250,0,0));
		
		
	}
	
	public double takeHit(int decreaseAmount){
		setHealth(getHealth()-decreaseAmount);
		if(getHealth()<= 0){
			return getExp();
		}
		return 0;
	}
	
	public void draw(Graphics g) {
		g.setColor( new Color((int)(Math.random()*250), (int)(Math.random()*250), (int)(Math.random()*250)));
		g.fillOval((int)this.getX(),(int)this.getY(), (int)getSize(),(int)getSize());
	}
	
	public void checkOffScreen() {

	}

	

}
