import java.awt.Color;

public class OptionsModel {
    
    Color snake1TempColor;
    Color snake2TempColor;
    Color backgroundColor;
    Color backgroundTempColor;
    
    private Snake snake1;
    private Snake snake2;
    
    String snake1Color;
    String snake2Color;
    String backgroundColorString;
    
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
    public void setSnake1ColorString(String snake1Color){
        this.snake1Color = snake1Color;
    }
      
    public Color getSnake2Color() {
        return snake2.getSnakeColor();
    }
    
    public void setSnake2ColorString(String snake2Color){
        this.snake2Color = snake2Color;
    }

    public void setSnake1TempColor(Color snake1Temp)
    {
        this.snake1TempColor = snake1Temp;
    }
        
    public void setSnake2TempColor(Color snake2Temp)
    {
        this.snake2TempColor = snake2Temp;
    }
    public void setBackColor(Color backgroundcolor)
    {
        this.backgroundColor = backgroundcolor;
    }
    
    public void setBackgroundColorString(String backgroundColorString) {
        this.backgroundColorString = backgroundColorString;
    }
    
    public String getBackgroundColorString() {
        return backgroundColorString;
    }
    
    public void setLabels()
    {
       gamePan.setColor(snake1.getSnakeColorString(), snake2.getSnakeColorString(), "White");
       mBPanel.setName(snake1.getSnakeName(), snake2.getSnakeName());
       System.out.println(snake1.getSnakeName());
    }
    
}
