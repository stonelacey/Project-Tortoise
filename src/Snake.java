
import java.awt.Color;

public class Snake {
    
    String snakeName;
    Color snakeColor;
    Color tempColor;
    
    Snake() {};
    
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
    
    public void setTempColor(Color tempColor) {
        this.tempColor = tempColor;
    }
    
    public Color getTempColor() {
        return tempColor;
    }
    
}
