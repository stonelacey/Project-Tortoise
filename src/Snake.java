
import java.awt.Color;

public class Snake {
    
    String snakeName;
    Color snakeColor;
    String snakeColorString;
    
    Snake() 
    {
        this.snakeName = "";
        snakeColor = Color.BLACK;
    };
    
    public void setSnakeName(String snakeName) {
        this.snakeName = snakeName;
    }
    
    public void setSnakeColor(Color snakeColor) {
        this.snakeColor = snakeColor;
    }
    
    public String getSnakeName() {
        return snakeName;
    }
    
    public Color getSnakeColor() {
        return snakeColor;
    }
    
    public void setSnakeColorString(String snakeColorString) {
        this.snakeColorString = snakeColorString;
    }
    
    public String getSnakeColorString() {
        return snakeColorString;
    }
    
}
