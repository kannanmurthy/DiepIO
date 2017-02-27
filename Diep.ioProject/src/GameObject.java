<<<<<<< HEAD:Diep.ioProject/src/GameObject.java
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public abstract class GameObject implements MovingObject {

	public static final double MAX_SIZE = 200,
							   MIN_SIZE = 50;
	private double speed;// 0 - 10
	private double direction, // degrees or radians
		x, y, // >= 0
	
		exp,
		size, // 10 might be a good size   
		health, // 0 - 100
		power;// not sure about this...
	private int level;//
	private Color color;
	
	
	public GameObject(double speed, double direction, double x, double y,double size, double health, double power, int level,Color color){
		this.speed = speed;
		this.direction = direction;
		this.setX(x);
		this.setY(y);
		this.setSize(size);
		this.health=health;
		this.setPower(power);
		this.setLevel(level);
		this.color=color;
		GameMap.movers.add(this);
	}
	@Override
	public void move() {
		setX(getX() + speed*Math.cos(direction));
		setY(getY() + (speed+Math.sin(direction)));
		
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
		GameMap.removeGameObject(this);
	}
	
	public abstract void checkOffScreen();
	
	public abstract void draw(Graphics g);
	@Override
	public Rectangle getBoundingRect() {
		
		return new Rectangle((int)getX(),(int)getY(),(int)getSize(),(int)getSize());
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getDirection(){
		return direction;
	}
	public void setDirection(double dir){
		direction = dir;
	}
	public double getSpeed(){
		return speed;
	}
	public void setSpeed(double sped){
		speed = sped;
	}

}
=======
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public abstract class GameObject implements MovingObject {

	public static final double MAX_SIZE = 200,
							   MIN_SIZE = 50;
	private double speed;// 0 - 10
	private double direction, // degrees or radians
		x, y, // >= 0
	
		exp,
		size, // 10 might be a good size   
		health, // 0 - 100
		power;// not sure about this...
	private int level;//
	private Color color;
	
	
	public GameObject(double speed, double direction, double x, double y,double size, double health, double power, int level,Color color){
		this.speed = speed;
		this.direction = direction;
		this.setX(x);
		this.setY(y);
		this.setSize(size);
		this.health=health;
		this.setPower(power);
		this.setLevel(level);
		this.color=color;
		GameMap.movers.add(this);
	}
	@Override
	public void move() {
		setX(getX() + speed*Math.cos(direction));
		setY(getY() + (speed*Math.sin(direction)));
		
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
		GameMap.removeGameObject(this);
	}
	
	public abstract void checkOffScreen();
	
	public abstract void draw(Graphics g);
	@Override
	public Rectangle getBoundingRect() {
		
		return new Rectangle((int)getX(),(int)getY(),(int)getSize(),(int)getSize());
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getDirection(){
		return direction;
	}
	public void setDirection(double dir){
		direction = dir;
	}
	public double getSpeed(){
		return speed;
	}
	public void setSpeed(double sped){
		speed = sped;
	}

}
>>>>>>> 616bcd54ddd32930787a35212f721b6db5b3f493:Diep.ioCarterQQ/src/GameObject.java
