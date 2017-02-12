import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;


public abstract class GameObject implements MovingObject {

	private double speed;// 0 - 10
	private double direction, // degrees or radians
		x, y, // >= 0
	
	
		size, // 10 might be a good size   
		health, // 0 - 100
		power;// not sure about this...
	private int level;//
	private Color color;
	public GameObject(double speed, double direction, double x, double y,double size, double health, double power, int level,Color color){
		this.speed = speed;
		this.direction = direction;
		this.x=x;
		this.y=y;
		this.size=size;
		this.health=health;
		this.power=power;
		this.level=level;
		this.color=color;
	}
	@Override
	public void move() {
		x+= speed*Math.cos(direction);
		y+= speed+Math.sin(direction);
		
		checkOffScreen();
		// maybe "push" back onto the screen change direction if
		// this object goes off the screen
	}
	public double getHealth(){
		return health;
	}
	
	public void setHealth(double health){
		this.health = health;
	}
	public void terminate(){
		
	}
	
	public abstract void checkOffScreen();
	
	
	@Override
	public Rectangle getBoundingRect() {
		
		return new Rectangle((int)x,(int)y,(int)size,(int)size);
	}

}
