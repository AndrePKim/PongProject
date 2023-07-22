import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{
    int yVelocity;
    int speed = 15;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT) {
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
    }
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W) {
            setYDirection(-speed);
            move();
        }
        if(e.getKeyCode()==KeyEvent.VK_S) {
            setYDirection(speed);
            move();
        }
    }
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W) {
            setYDirection(0);
            move();
        }
        if(e.getKeyCode()==KeyEvent.VK_S) {
            setYDirection(0);
            move();
        }
    }
    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }
    public void move() {
        y = y+yVelocity;
    }
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x,y,width,height);
    }
}
