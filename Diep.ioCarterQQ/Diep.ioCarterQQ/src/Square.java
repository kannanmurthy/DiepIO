import java.awt.Graphics;


public class Square extends ShootableFarm {

	public Square(double x, double y,  double health) {
		super(x, y, 15, health);
		setExp(50);
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval((int)this.getX(),(int)this.getY(), (int)getSize(),(int)getSize());
	}

}
