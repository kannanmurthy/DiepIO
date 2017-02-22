import java.awt.*;

public class Tank extends GameObject implements MovingObject {

private int MAX_SPEED = 10;

public Tank(double x, double y, Color color) {
   super(0, Math.PI, x, y, 30, 100, 1, 1, color);
}

@Override
public void checkOffScreen() {
   // TODO Auto-generated method stub


}
public void shoot() {
	new Bullet(this.getSpeed()+10, this.getDirection(), this.getPower(), this.getX(),this.getY());
}
@Override
public void move() {
    super.move();
    //key binding stuff goes here

}
public void accelerate(){
	this.setSpeed((this.getSpeed()*5+1)/MAX_SPEED);
}


public void draw(Graphics g) {
	g.setColor(new Color(150,0,250));
	
	if(this.getDirection() == Math.PI/2){
		g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2),(int) this.getSize()/2*3,(int) this.getSize()/2*3);
		g.fillRect((int) this.getX(),(int) this.getY(),(int)this.getSize()/3*2,(int)this.getSize()*2);
	}
	if(this.getDirection() == 0){
		   g.fillRect((int) this.getX(),(int) this.getY(),(int)this.getSize()*2,(int)this.getSize()/3*2);
		   g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2),(int) this.getSize()/2*3,(int) this.getSize()/2*3);
	}
	if(this.getDirection() == Math.PI*3/2){
		g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2),(int) this.getSize()/2*3,(int) this.getSize()/2*3);
		g.fillRect((int) this.getX()+(int)this.getSize()/3*2-(int)this.getSize()/4,(int) this.getY(),(int)this.getSize()/3*2,(int)this.getSize()*2);
	}
	if(this.getDirection() == Math.PI){
		g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2),(int) this.getSize()/2*3,(int) this.getSize()/2*3);
		g.fillRect((int) this.getX()-(int)this.getSize()*2,(int) this.getY()-(int)this.getSize()/3*2,(int)this.getSize()*2,(int)this.getSize()/3*2);
	}
   
	

}
}