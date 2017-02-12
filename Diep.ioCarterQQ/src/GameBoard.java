import java.awt.Color;
import java.awt.Graphics;

public class GameBoard {
    private Tank t= new Tank(0, 0, 10, 10, 10, 10, 0, 0, Color.LIGHT_GRAY);
    //double speed, double direction, double x, double y, double size, double health, double power, int level, Color color

    public GameBoard(){
    }
    
    public void draw(Graphics g){
        t.draw(g);
    }
    
}
