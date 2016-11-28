
import java.awt.Color;

//Matt
public class OptionsModel {
    
    String snake1Name;
    String snake2Name;
    Color snake1Color;
    Color snake2Color;
    Color snake1TempColor;
    Color snake2TempColor;
    Color backgroundColor;
    Color backgroundTempColor;
    
    private Snake snake1;
    private Snake snake2;
    
    OptionsModel() {
        snake1 = new Snake();
        snake2 = new Snake();
    }
    
    public String getSnake1Name() {
        return snake1.getSnakeName();
    }
    
    public void setSnake1Name(String snake1Name) {
        this.snake1Name = snake1Name;
    }
    
    public String getSnake2Name() {
        return snake2.getSnakeName();
    }
    
    public void setSnake2Name(String snake2Name) {
        this.snake2Name = snake2Name;
    }
    
    public Color getSnake1Color() {
        return snake1.getSnakeColor();
    }
    
    public void setSnake1Color(Color snake1Color) {
        this.snake1Color = snake1Color;
    }
    
    public Color getSnake2Color() {
        return snake2.getSnakeColor();
    }
    
    public void setSnake2Color(Color snake2Color) {
        this.snake2Color = snake2Color;
    }
    
    public Color getSnake1TempColor() {
        return snake1.getTempColor();
    }
    
    public void setSnake1TempColor(Color snake1TempColor) {
        this.snake1TempColor = snake1TempColor;
    }
    
    public Color getSnake2TempColor() {
        return snake2.getTempColor();
    }
    
    public void setSnake2TempColor(Color snake2TempColor) {
        this.snake2TempColor = snake2TempColor;
    }
    
}
