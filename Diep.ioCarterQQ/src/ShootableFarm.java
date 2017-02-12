import java.awt.Color;
import java.awt.Graphics;


public class ShootableFarm extends GameObject {
	private double Health, Size, Level;
	private double X, Y;
	private Color esteColor;
	
	public ShootableFarm(double x, double y,double size, double health){
		super(0, 0, x, y, size, health, 0,0, new Color(255, 0, 0));
		Health = health;
		X = x;
		Y = y;
		Size = size;
		
		
	}
	
	public int takeHit(int power){
		Health-=power;
		if(Health<= 0){
			return 400;
		}
		return 0;
	}
	public void draw(Graphics g){
		if(Health < 0)
			return;
		g.setColor(new Color(250,0,0));
		g.fillOval((int)X, (int)Y, (int)Size, (int)Size*3/4);
	}
	
	
	public void checkOffScreen() {

	}

}
