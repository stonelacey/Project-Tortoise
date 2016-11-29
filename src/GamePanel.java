import javax.swing.*;

public class GamePanel extends JPanel{
    private JLabel backcolor;
    private JLabel snake1color;
    private JLabel snake2color;
    
    GamePanel()
    {
        backcolor = new JLabel("Background is: ");
        snake1color = new JLabel("Snake 1 Color: ");
        snake2color = new JLabel("Snake 2 Color: ");
        add(backcolor);
        add(snake1color);
        add(snake2color);
    }
    
    public void setColor(String color1, String color2, String color3)
    {
        this.backcolor.setText("Background color is: " + color1);
        this.snake1color.setText("Snake 1 color is: " + color2);
        this.snake2color.setText("Snake 2 color is:" + color3);
        
    }
    
}
