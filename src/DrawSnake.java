
import java.awt.Color;
import java.awt.Graphics;

public class DrawSnake {
    
    int snakeLength;
    Color snakeColor;
    
    DrawSnake() {}
    
    //Color will be passed in from GamePanel
    public void setSnakeColor(Color snakeColor) {
        this.snakeColor = snakeColor;
    }
    
    public void addSquareToSnake(Graphics g) {
        //Logic to add a square to the snake
        snakeLength++;
        g.setColor(snakeColor);
        //Need to add logic to where square is added (and what size)
        g.fillRect(10, 10, 10, 10);
    }
    
}
