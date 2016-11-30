import javax.swing.*;

public class GamePanel extends JPanel{
    private JLabel backcolor;
    private JLabel snake1color;
    private JLabel snake2color;
    private OptionsModel optMod;
    
    GamePanel(OptionsModel optMod)
    {
        this.optMod = optMod;
        
        backcolor = new JLabel();
        snake1color = new JLabel();
        snake2color = new JLabel();
        add(backcolor);
        add(snake1color);
        add(snake2color);
    }
    
    public void setColor(String color3, String color1, String color2)
    {
        backcolor.setText("Background color is: " + color3);
        snake1color.setText("Snake 1 color is: " + color1);
        snake2color.setText("Snake 2 color is: " + color2);
             
    }
    
}
