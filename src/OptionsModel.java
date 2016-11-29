import java.awt.Color;

public class OptionsModel {
    
    Color snake1TempColor;
    Color snake2TempColor;
    Color backgroundColor;
    Color backgroundTempColor;
    
    private Snake snake1;
    private Snake snake2;
    
    String color1;
    String color2;
    String color3;
    
    GamePanel gamePan;
    MainButtonPanel mBPanel;
    OptionsModel optMod;
    
    OptionsModel() {
        this.optMod = optMod;
        gamePan = new GamePanel(optMod);
        mBPanel = new MainButtonPanel();
        snake1 = new Snake();
        snake2 = new Snake();
    }
    
    public void setSnakeName(String snake1, String snake2)
    {
        this.snake1.setSnakeName(snake1);
        this.snake2.setSnakeName(snake2);
    }
    
    public void setSnakeColor()
    {
        this.snake1.setSnakeColor(snake1TempColor);
        this.snake2.setSnakeColor(snake2TempColor);
    }
    
    public Color getSnake1Color() {
        return snake1.getSnakeColor();
    }
    public String getSnake1ColorString(){
        return snake1.getSnakeColor().toString();
    }
      
    public Color getSnake2Color() {
        return snake2.getSnakeColor();
    }

    public void setSnake1TempColor(Color snake1Temp, String color)
    {
        this.snake1TempColor = snake1Temp;
        this.color1 = color;
    }
        
    public void setSnake2TempColor(Color snake2Temp, String color)
    {
        this.snake2TempColor = snake2Temp;
        this.color2 = color;
    }
    public void setBackColor(Color backgroundcolor, String color)
    {
        this.color3 = color;
        this.backgroundColor = backgroundcolor;
    }
    
    public void setLabels()
    {
       gamePan.setColor(this.color3, this.color2, this.color1);
       mBPanel.setName(snake1.getSnakeName(), snake2.getSnakeName());
        System.out.println(snake1.getSnakeName());
    }
    
}
