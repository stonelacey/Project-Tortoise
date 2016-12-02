import javax.swing.*;

public class GamePanel extends JPanel{
    private JLabel backcolor;
    private JLabel snake1color;
    private JLabel snake2color;
    private OptionsModel optMod;
    private JPanel gameArea;
    
    GamePanel(OptionsModel optMod)
    {
        this.optMod = optMod;
        
        gameArea = new JPanel();
        gameArea.setSize(750, 450);
        
        
        backcolor = new JLabel();
        snake1color = new JLabel();
        snake2color = new JLabel();
        add(backcolor);
        add(snake1color);
        add(snake2color);
        add(gameArea);
    }
    
    public void setColor(String color3, String color1, String color2)
    {
        backcolor.setText("Background color is: " + color3);
        snake1color.setText("Snake 1 color is: " + color1);
        snake2color.setText("Snake 2 color is: " + color2);
             
    }
    
}
