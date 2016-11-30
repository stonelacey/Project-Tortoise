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
    
    public String getSnake1Name() {
        return snake1.getSnakeName();
    }
    
    public String getSnake2Name() {
        return snake2.getSnakeName();
    }
    
    public void setSnake1Color(Color snake1TempColor) {
        this.snake1.setSnakeColor(snake1TempColor);
    }
    
    public void setSnake2Color(Color snake2TempColor) {
        this.snake2.setSnakeColor(snake2TempColor);
    }
    
    public Color getSnake1Color() {
        return snake1.getSnakeColor();
    }
    public void setSnake1ColorString(String snake1Color){
        this.snake1.setSnakeColorString(snake1Color);
    }
    public String getSnake1ColorString() {
        return snake1.getSnakeColorString();
    }
      
    public Color getSnake2Color() {
        return snake2.getSnakeColor();
    }
    
    public void setSnake2ColorString(String snake2Color){
        this.snake2.setSnakeColorString(snake2Color);
    }
    public String getSnake2ColorString() {
        return snake2.getSnakeColorString();
    }

    public void setSnake1TempColor(Color snake1Temp)
    {
        this.snake1TempColor = snake1Temp;
    }
    
    public Color getSnake1TempColor() {
        return snake1TempColor;
    }
        
    public void setSnake2TempColor(Color snake2Temp)
    {
        this.snake2TempColor = snake2Temp;
    }
    
    public Color getSnake2TempColor() {
        return snake2TempColor;
    }
    
    public void setBackColor(Color backgroundColor)
    {
        this.backgroundColor = backgroundColor;
    }
    
    public void setBackgroundTempColor(Color backgroundTempColor) {
        this.backgroundTempColor = backgroundTempColor;
    }
    
    public Color getBackgroundTempColor() {
        return backgroundTempColor;
    }
    
    public void setBackgroundColorString(String backgroundColorString) {
        this.backgroundColorString = backgroundColorString;
    }
    
    public String getBackgroundColorString() {
        return backgroundColorString;
    }
    
    public void setLabels()
    {
       gamePan.setColor(getBackgroundColorString(), getSnake1ColorString(), getSnake2ColorString());
       mBPanel.setName(getSnake1Name(), getSnake2Name());
    }
    
}
