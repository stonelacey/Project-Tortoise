import java.awt.Graphics;
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
    
            @Override
    public void paintComponent(Graphics g)
    {
        int xVal = 50;
        int yVal = 50;
        for (int x = 0; x <= 700; x++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            xVal++;
            
        }
        for (int y = 0; y < 400; y++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            yVal++;
            
        }
        for (int z = 0; z <= 700; z++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            xVal--;
            
        }
        for (int w = 0; w < 400; w++)
        {
            g.fillRect(xVal, yVal, 3, 3);
            yVal--;
            
        }
        
        g.fillRect(375, 225, 25, 25);
        
    
    }
    
    public void setColor(String color3, String color1, String color2)
    {
        
    }
    
}
