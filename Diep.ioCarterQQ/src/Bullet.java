import java.awt.Color;


public class Bullet extends GameObject {
	double Speed, Direction, X, Y, Power;
public Bullet(double speed, double direction, double power, double x, double y){
	super(speed, direction, x, y, 2,1, power, 0, new Color (0,0,250));
	Speed = speed;
	Y = y;
	X = x;
	Direction = direction;
	Power = power;
}
public void HitObject(GameObject go){
	go.setHealth(go.getHealth()-Power);
	terminate();
}

	@Override
	public void checkOffScreen() {
		// TODO Auto-generated method stub

	}

}
