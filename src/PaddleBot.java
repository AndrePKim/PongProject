import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PaddleBot extends Rectangle{
    int yVelocity;
    int ballYPosition;

    PaddleBot(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, Ball ball) {
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
    }
    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }
    public void move() {
        y = y+yVelocity;
    }
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x,y,width,height);
    }
}