import java.awt.*;

public class Tank extends GameObject implements MovingObject {

private double exp = 0;

public Tank(double x, double y, Color color) {
   super(0, Math.PI/2, x, y, 20, 100, 1, 1, color);
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
public void levelUp() {
    //level up the tank once exp reaches a certain point
    setLevel(getLevel() + 1);

  }


public void draw(Graphics g) {
	g.setColor(new Color(150,0,250));
   g.fillRect((int) this.getX(),(int) this.getY(),(int)this.getSize()*2,(int)this.getSize()/3*2);
   g.fillOval((int) this.getX(),(int) (this.getY()-this.getSize()/2),(int) this.getSize()/2*3,(int) this.getSize()/2*3);
   


}
}