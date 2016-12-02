import javax.swing.*;

public class GamePanel extends JPanel
{
    private OptionsModel optMod;
    private JPanel gameArea;
    
    GamePanel(OptionsModel optMod)
    {
        this.optMod = optMod;
        
        gameArea = new JPanel();
        gameArea.setSize(750, 450);
        
        JLabel backcolor = new JLabel();
        JLabel snake1color = new JLabel();
        JLabel snake2color = new JLabel();
        add(backcolor);
        add(snake1color);
        add(snake2color);
        add(gameArea);
    }
    
    public void setColor(String color3, String color1, String color2)
    {
        
    }
    
}
