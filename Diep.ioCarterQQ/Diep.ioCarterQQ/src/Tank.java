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
    //fire away
  //Bullet.hit();
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
	g.setColor(new Color(250,0,0));
   g.fillRect(10,10,50,50);
   


}
}