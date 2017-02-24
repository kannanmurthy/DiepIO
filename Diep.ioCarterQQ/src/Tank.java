import java.awt.*;

public class Tank extends GameObject implements MovingObject {

private int MAX_SPEED = 25;

public Tank(double x, double y, Color color) {
   super(0, 0, x, y, 30, 100, 1, 1, color);
   DiepIOMap.tankList.add(this);
}

@Override
public void checkOffScreen() {
   // TODO Auto-generated method stub
}
public void terminate(){
	DiepIOMap.tankList.remove(this);
	super.terminate();
}
public void shoot() {
	new Bullet(this.getSpeed()+5, this.getDirection(), this.getPower(), this.getX()+Math.cos(this.getDirection()*this.getSize()),this.getY()+Math.sin(this.getDirection())*this.getSize());
}
@Override
public void move() {
    super.move();
    //key binding stuff goes here
}
public void rotateLeft(){
	this.setDirection(this.getDirection()-Math.PI/2);
	
}
public void rotateRight(){
	this.setDirection(this.getDirection()+Math.PI/2);
}
public void accelerate(){
	this.setSpeed((this.getSpeed()*25+1)/MAX_SPEED);
}


public void draw(Graphics g) {
	g.setColor(new Color(150,0,250));
	
	if(this.getDirection()%(Math.PI*2) > Math.PI/2-.5 && this.getDirection()%(Math.PI*2) < Math.PI/2+.5){
		g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2),(int) this.getSize()/2*3,(int) this.getSize()/2*3);
		g.fillRect((int) this.getX()+(int)this.getSize()/3*2-(int)this.getSize()/4,(int) this.getY(),(int)this.getSize()/3*2,(int)this.getSize()*2);
		System.out.println("happened1"+this.getDirection());
	}
	else if(this.getDirection()%(Math.PI*2) > -.5 && this.getDirection()%(Math.PI*2) < .5){ //essentially this.getDirection()%(Math.PI*2) == 0
		   g.fillRect((int) this.getX()+12,(int) this.getY(),(int)this.getSize()*2,(int)this.getSize()/3*2);
		   g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2)+1,(int) this.getSize()/2*3,(int) this.getSize()/2*3);
		   System.out.println("happened2"+this.getDirection());
	}
	else if(this.getDirection()%(Math.PI*2) > Math.PI*3/2-.5 && this.getDirection()%(Math.PI*2) < Math.PI*3/2+.5){
		g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2),(int) this.getSize()/2*3,(int) this.getSize()/2*3);
		g.fillRect((int) this.getX()+13,(int) this.getY()-(int)this.getSize()*3/2,(int)this.getSize()/3*2,(int)this.getSize()*2);
		System.out.println("happened3"+this.getDirection());
	}
	else if(this.getDirection()%(Math.PI*2) > Math.PI-.5 && this.getDirection()%(Math.PI*2) < Math.PI+.5){
		g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2),(int) this.getSize()/2*3,(int) this.getSize()/2*3);
		g.fillRect((int) this.getX()-(int)this.getSize(),(int) this.getY()-2,(int)this.getSize()*2,(int)this.getSize()/3*2);
		System.out.println("happened4"+this.getDirection());
	}
   
	

}
}