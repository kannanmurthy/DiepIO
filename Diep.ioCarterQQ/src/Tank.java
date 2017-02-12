import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Tank extends GameObject implements MovingObject {

 private double health, speed, direction, level = 1.0, size, color, exp = 0, power,x,y;

 public Tank(double speed, double direction, double x, double y,double size, double health, double power, int level,Color color) {
    super(speed, direction, x, y, size, health, power, level, color);
    this.health = health;
    this.direction = direction;
    this.level = level;
    this.size = size;
    this.power = power;
    this.x = x;
    this.y = y;
  
    checkOffScreen();
 }

 @Override
 public void checkOffScreen() {
    // TODO Auto-generated method stub


 }
 public void shoot() {
     new Bullet(speed+5,direction,power,x,y);

 }
 @Override
 public void move() {

 }
 public void levelUp() {
     //level up the tank once exp reaches a certain point
     level++;

   }


 public void draw(Graphics g) {
    // TODO Auto-generated method stub
     //g.drawRect(50,50,20,50);
     g.setColor(Color.BLUE);
    g.fillRect(10,10,50,50);




  
 }

}
